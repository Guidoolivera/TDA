package ListaCircular;

public class NodoLC {

    public Object valor;
    public NodoLC siguiente;

    public NodoLC (Object valor){
        this.valor = valor;
        siguiente = this;
    }
}
