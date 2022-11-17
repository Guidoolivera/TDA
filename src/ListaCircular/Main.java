package ListaCircular;

import ListaDoblementeEnlazada.ListaDoble;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ListaCircular listita = new ListaCircular();
        int opcion = 0;
        Object elemento;
        boolean eliminado = false;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1: Agregar Nodo a la lista circular.\n" +
                                "2: Eliminar un Nodo de la lista circular.\n " +
                                "3: Mostrar la lista circular.\n" +
                                "4: Salir.\n" +
                                "¿Qué deseas hacer?", "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del nodo", "Agregando nodo a la lista circular", JOptionPane.INFORMATION_MESSAGE));
                        listita.agregarNodo(elemento);
                        break;
                    case 2:
                        if (!listita.estaVacia()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento del nodo a eliminar",
                                    "Eliminando nodo de la lista circular", JOptionPane.INFORMATION_MESSAGE));
                            eliminado = listita.eliminarNodo(elemento);
                            if (eliminado){
                                JOptionPane.showMessageDialog(null, "El elemento eliminado es: "
                                                + elemento,
                                        "Eliminando nodo", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "El elemento " + elemento + " no está en la lista.",
                                        "Elemento no encontrado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No hay nodos aún.",
                                    "Lista vacía.", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!listita.estaVacia()) {
                            listita.mostrarLista();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aún.",
                                    "Lista vacía.", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada.",
                                "FIN", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opción no está en el menú.",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error: " + n.getMessage());
            }
        } while (opcion != 4);
    }
}
