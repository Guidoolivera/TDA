package Arboles;

public class ColaBFS {
    private NodoColaBFS primero;
    private NodoColaBFS ultimo;
    private int tamaño;

    public ColaBFS(){
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public boolean estaVacia(){
        return this.primero == null;
    }


    public void encolar(NodoArbol valor){
        NodoColaBFS nuevo = new NodoColaBFS(valor);

        if(estaVacia()){
            this.primero = nuevo;
            this.ultimo = nuevo;
        }
        else{
            this.ultimo.siguiente = nuevo;
            this.ultimo = nuevo;
        }
        this.tamaño++;
    }

    public NodoArbol desencolar(){
        if (estaVacia()){
            return null;
        }
        else{
            NodoArbol aux = this.primero.valor;
            this.primero = this.primero.siguiente;
            this.tamaño--;
            return aux;
        }
    }
}
