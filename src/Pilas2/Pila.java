package Pilas2;

public class Pila {
    private NodoPila cima;
    int tamaño;

    public Pila(){
        cima = null;
        tamaño = 0;
    }

    //Método para saber cuando está vacía;
    public boolean estaVacia(){
        return cima == null;
    }

    //Método para empujar un elemento;
    public void push(int dato){
        NodoPila nuevo = new NodoPila(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }

    //Método para sacar un elemento;
    public int pop(){
        int aux = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return aux;
    }

    //Método para conocer la cima de la pila.
    public int obtenerCima(){
        return cima.dato;
    }

    //Método para saber el tamaño de la pila.
    public int obtenerTamaño(){
        return tamaño;
    }

    //Método para vaciar la pila
    public void limpiarPila(){
        while (!estaVacia()){ //mientras la pila no esté vacía...
            pop(); //sacar el último elemento
        }
    }
}
