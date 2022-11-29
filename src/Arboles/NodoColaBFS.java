package Arboles;

//Nodo de tipo Cola para realizar un recorrido en anchura del Árbol Binario.
public class NodoColaBFS {

    //Atributo para apuntar recursivamente a otro nodo de la cola.
    public NodoColaBFS siguiente;

    //Atributo para almacenar un valor del tipo NodoÁrbol.
    public NodoArbol valor;

    public NodoColaBFS (NodoArbol valor){
        this.valor = valor;
        this.siguiente = null;
    }
}
