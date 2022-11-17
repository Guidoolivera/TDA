package Arboles;

public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    //Método para agregar un nodo en el árbol.
    public void agregarNodo(int dato, String nombre) {
        NodoArbol nuevo = new NodoArbol(dato, nombre);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol aux = raiz;
            NodoArbol padre;
            while (true) {
                padre = aux;
                if (dato < aux.dato) {
                    aux = aux.izq;
                    if (aux == null) {
                        padre.izq = nuevo;
                        return;
                    }
                } else {
                    aux = aux.der;
                    if (aux == null) {
                        padre.der = nuevo;
                        return;
                    }
                }
            }
        }
    }

    //Método para saber cuando el árbol está vacío.
    public boolean estaVacio() {
        return raiz == null;
    }

    //Método para recorrer inOrder.
    public void inOrder(NodoArbol r) {       //le enviamos como parámetro la raíz.
        if (r != null) {
            inOrder(r.izq);
            System.out.print(r.dato + ", ");
            inOrder(r.der);
        }
    }

    //Método para recorrer en preOrder.
    public void preOrder(NodoArbol r) {       //le enviamos como parámetro la raíz.
        if (r != null) {
            System.out.print(r.dato + ", ");
            preOrder(r.izq);
            preOrder(r.der);
        }
    }

    //Método para recorrer en posOrder.
    public void posOrder(NodoArbol r) {       //le enviamos como parámetro la raíz.
        if (r != null) {
            posOrder(r.izq);
            posOrder(r.der);
            System.out.print(r.dato + ", ");
        }
    }

    //Método para buscar un nodo en el árbol.
    public NodoArbol buscarNodo(int valor) {
        NodoArbol aux = raiz;
        while (aux.dato != valor) {
            if (valor < aux.dato) {
                aux = aux.izq;
            } else {
                aux = aux.der;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    //Método para eliminar un nodo.
    public boolean eliminarNodo(int valor) {
        NodoArbol aux = raiz;
        NodoArbol padre = raiz;
        boolean esHijoIzq = true;
        while (aux.dato != valor) {
            padre = aux;
            if (valor < aux.dato) {
                esHijoIzq = true;
                aux = aux.izq;
            } else {
                esHijoIzq = false;
                aux = aux.der;
            }
            if (aux == null) {
                return false;
            }
        }//Fin while.
        if (aux.izq == null && aux.der == null) { //es una hoja
            if (aux == raiz) {
                raiz = null;
            } else if (esHijoIzq) {
                padre.izq = null;
            } else {
                padre.der = null;
            }
        } else if (aux.der == null) {
            if (aux == raiz) {
                raiz = aux.izq;
            } else if (esHijoIzq) {
                padre.izq = aux.izq;
            } else {
                padre.der = aux.izq;
            }
        } else if (aux.izq == null) {
            if (aux == raiz) {
                raiz = aux.der;
            } else if (esHijoIzq) {
                padre.der = aux.der;
            } else {
                padre.izq = aux.der
                ;
            }
        } else {
            NodoArbol reemplazo = obtenerReemplazo(aux);
            if (aux == raiz) {
                raiz = reemplazo;
            } else if (esHijoIzq) {
                padre.izq = reemplazo;
            } else {
                padre.der = reemplazo;
            }
            reemplazo.izq = aux.izq;
        }
        return true;
    }

    //Método para obtener el nodo reemplazo.
    public NodoArbol obtenerReemplazo(NodoArbol nodoReemp){
        NodoArbol reemplazarPadre = nodoReemp;
        NodoArbol reemplazo = nodoReemp;
        NodoArbol aux = nodoReemp.der;
        while (aux != null){
            reemplazarPadre = reemplazo;
            reemplazo = aux;
            aux = aux.izq;
        }
        if (reemplazo != nodoReemp.der){
            reemplazarPadre.izq = reemplazo.der;
            reemplazo.der = nodoReemp.der;
        }
        System.out.println("El nodo reemplazo es: " + reemplazo);
        return reemplazo;
    }
}
