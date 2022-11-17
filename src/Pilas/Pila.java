package Pilas;

public class Pila {
    int vectorPila[];
    int cima;

    public Pila(int tamaño){
        vectorPila = new int[tamaño];
        cima = -1;
    }

    //Metodo push para empujar un dato.
    public void push(int dato){
        cima++;
        vectorPila[cima] = dato;
    }

    //Metodo pop para sacar un dato
    public int pop(){
        int aux = vectorPila[cima];
        cima--;
        return aux;
    }

    //Metodo para saber si está vacía
    public boolean estaVacia(){
        return cima==-1;
    }

    //Metodo para saber si está llena
    public boolean estaLlena(){
        return vectorPila.length-1 == cima;
    }

    //Método que devuelve el elemento de la cima
    public int obtenerCima(){
        return vectorPila[cima];
    }

    //Método para obtener el tamaño de la pila
    public int obtenerTamaño(){
        return vectorPila.length;
    }
}
