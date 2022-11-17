package ListaDoblementeEnlazada;

import javax.swing.*;

public class ListaDoble {

    private NodoDoble inicio, fin;

    //Constructor por defecto;
    public ListaDoble(){
        inicio = fin = null;
    }

    public boolean estaVacia(){
        return inicio == null;
    }

    public void agregarAlFinal(Object valor){
        if (!estaVacia()){
            fin = new NodoDoble(valor, null, fin);
            fin.anterior.siguiente = fin;
        }else {
            inicio = fin = new NodoDoble(valor);
        }
    }

    public void agregarAlInicio(Object valor){
        if (!estaVacia()){
            inicio = new NodoDoble(valor, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else {
            inicio = fin = new NodoDoble(valor);
        }
    }

    //Método para mostrar la lista de inicio a fin.
    public void mostrarDeInicioAFin(){
        if(!estaVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null){
                datos = datos + "[" + auxiliar.valor + "]<=>";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando lista de Inicio a Fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Método para mostrar la lista de Fin a Inicio.
    public void mostrarDeFinAInicio(){
        if(!estaVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while (auxiliar != null){
                datos = datos + "[" + auxiliar.valor + "]<=>";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando lista de Fin a Inicio",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Método para eliminar Nodo del inicio.
    public Object eliminarDelInicio(){
        Object elemento = inicio.valor;
        if (inicio == fin){ //Si hay UNO o NINGóN nodo, el inicio será igual al fin.
            inicio = fin = null;
        }
        else {                              //Si hay más de un nodo
            inicio = inicio.siguiente;      //El inicio de la lista será ahora el siguiente nodo.
            inicio.anterior = null;         //Ahora, el puntero ANTERIOR del nuevo inicio de la lista será nulo.
        }
        return elemento;
    }

    //Método para eliminar Nodo del inicio.
    public Object eliminarDelFinal(){
        Object elemento = fin.valor;
        if (inicio == fin){ //Si hay UNO o NINGÚN nodo, el inicio será igual al fin.
            inicio = fin = null;
        }
        else {                      //Si hay más de un nodo
            fin = fin.anterior;     //El fin de la lista será ahora el anterior nodo del final.
            fin.siguiente = null;   //Ahora, el puntero siguiente del nuevo fin de la lista será nulo.
        }
        return elemento;
    }
}
