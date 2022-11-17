package Arboles;

public class NodoArbol {
    public int dato;
    public String nombre;
    public NodoArbol izq;
    public NodoArbol der;

    public NodoArbol(int dato, String nombre) {
        this.dato = dato;
        this.nombre = nombre;
        this.izq = null;
        this.der = null;
    }


    @Override
    public String toString() {
        return "Nodo " + nombre + ". Su valor es: " + dato;
    }
}
