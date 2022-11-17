package ListaCircular;

import ListaSimpleB.Nodo;

import javax.swing.*;

public class ListaCircular {

    NodoLC ultimo;

    public ListaCircular() {
        this.ultimo = null;
    }

    //Método para saber cuando la lista está vacía.
    public boolean estaVacia(){
        return ultimo == null;
    }

    //Método para insertar nodos.
    public ListaCircular agregarNodo(Object valor){
        NodoLC nuevo = new NodoLC(valor);
        if (ultimo != null){
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }

    //Método para mostrar la lista.
    public void mostrarLista(){
        NodoLC auxiliar = ultimo.siguiente;
        String cadena = "";
        do {
            cadena = cadena + "[" + auxiliar.valor + "]->";
            auxiliar = auxiliar.siguiente;
        }while (auxiliar != ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena, "Mostrando la lista circular", JOptionPane.INFORMATION_MESSAGE);
    }

    //Método para eliminar un nodo de la lista circular
    public boolean eliminarNodo(Object valor){
        NodoLC actual;                  //Nodo que almacenara cada comparación para recorrer la lista.
        boolean encontrado = false;     //variable para saber si se encontró el valor.
        actual = ultimo;                //
        while (actual.siguiente != ultimo && !encontrado){ //Mientras que el primer nodo agregado sea distinto
                                                            // del ultimo, y NO encontrado(true, ya que se inicializó en false).
            encontrado = (actual.siguiente.valor == valor); //Aquí almacenar si el valor del primer nodo agregado es = al valor pasado.
            if (!encontrado){ // Si se encontró, hay que eliminarlo.
                actual = actual.siguiente;
            }
        }
        encontrado = (actual.siguiente.valor == valor);
        if (encontrado){
            NodoLC auxiliar = actual.siguiente;
            if (ultimo == ultimo.siguiente){
                ultimo = null;
            }
            else {
                if (auxiliar == ultimo){
                    ultimo = actual;
                }
                actual.siguiente = auxiliar.siguiente;
            }
            auxiliar = null;
        }
        return encontrado == true;
    }

}
