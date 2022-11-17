package Pilas2;

import ListaCircular.NodoLC;

public class NodoPila {
    int dato;
    NodoPila siguiente;

    public NodoPila(int dato){
        this.dato = dato;
        siguiente = null;
    }
}
