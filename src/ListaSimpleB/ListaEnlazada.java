package ListaSimpleB;

public class ListaEnlazada {
    /*Crear una lista enlazada nos permitirá implementar métodos como agregarElemento, obtenerElemento utilizando un
    índice como si fuera un Arreglo, etc. Este tipo de lista tendra un primer elemento que llamaremos "Cabeza": este
    será el punto de partida para recorrer la lista entera.

     */
    Nodo cabeza;
    int tamaño;

    public ListaEnlazada(){
        cabeza = null;
        tamaño = 0;
    }

    public Object obtener(int indice){
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < indice){
            temporal = temporal.getSiguiente();
            contador++;
        }
        return temporal.getValor();
    }

    public void agregarPrimero(Object obj){
        if (cabeza == null){
            cabeza = new Nodo(obj);
        }
        else{
            Nodo aux = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.agregarSiguiente(aux);
            cabeza = nuevo;
        }
        tamaño++;
    }

    public void eliminarPrimero(){
        cabeza = cabeza.getSiguiente();
        tamaño--;
    }

    public void eliminarSegunIndice(int indice){
        if (indice == 0){
            cabeza = cabeza.getSiguiente();
        }
        else {
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < indice-1){
            temporal = temporal.getSiguiente();
            contador++;
        }
        temporal.agregarSiguiente(temporal.getSiguiente().getSiguiente());
        }
    }

    public void cortar(int indice){
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < indice){
            temporal = temporal.getSiguiente();
            contador++;
        }
        temporal.agregarSiguiente(null);
        tamaño = indice;
    }

    public int getTamaño(){
        return tamaño;
    }

    public boolean estaVacia(){
        return (cabeza == null) ? true:false;
    }
}
