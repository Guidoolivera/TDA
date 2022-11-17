package ListaSimpleB;

public class Nodo {
    public Object valor;
    public Nodo siguiente;

    public Nodo(Object valor){
        this.valor = valor;
        this.siguiente = null;
    }

    public Object getValor(){
        return this.valor;
    }

    public void agregarSiguiente(Nodo nuevoNodo){
        this.siguiente = nuevoNodo;
    }

    public Nodo getSiguiente(){
        return this.siguiente;
    }
}
