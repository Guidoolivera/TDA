package ListaDoblementeEnlazada;

import ListaSimpleB.Nodo;

public class NodoDoble {

    public Object valor;
    NodoDoble siguiente, anterior;

    public NodoDoble(Object valor){
        this(valor,null,null);
    }

    //Constructor en caso de que ya existan Nodos:
    public NodoDoble(Object valor, NodoDoble siguiente, NodoDoble anterior){
        this.valor = valor;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }


}
