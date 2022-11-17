package ListaSimple;

public class ListaSimple {
    private Nodo actual;
    public int tamaño;

    public ListaSimple() {
        this.actual = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.actual == null;
    }

    public void agregar(String valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            // agregamos el primer nodo
            this.actual = nuevo;
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = this.actual;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        this.tamaño++;
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = actual;
            Nodo nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces lo hago null para indicar que la lista esta vacia.
            if (aux == this.actual) {
                this.actual = null;
            } else {
                // Le indico al nodo anterior que no apunte más al nodo a eliminar "aux".
                nodoAnterior.siguiente = null;
            }

            // Decremento el tamaño
            this.tamaño--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = this.actual;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
}
