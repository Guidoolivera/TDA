package Colas;

public class Cola {
    private NodoCola primero;
    private NodoCola ultimo;
    private int tamaño;

    public Cola() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void encolar(int dato) {

        NodoCola nuevo = new NodoCola(dato);

        if (estaVacia()) {
            this.primero = nuevo;
        } else {
            this.ultimo.siguiente = nuevo;
        }
        this.ultimo = nuevo;
        this.tamaño++;
    }

    public int desencolar() {

        int aux = primero.dato;
        primero = primero.siguiente;
        tamaño--;
        return aux;
    }

    public int obtenerPrimero() {
        return primero.dato;
    }

    public int obtenerTamaño() {
        return tamaño;
    }
}
