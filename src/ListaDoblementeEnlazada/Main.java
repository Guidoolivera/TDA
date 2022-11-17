package ListaDoblementeEnlazada;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ListaDoble listita = new ListaDoble();
        int opcion = 0;
        Object elemento;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1: Agregar Nodo al inicio.\n" +
                                "2: Agregar Nodo al final.\n " +
                                "3: Mostrar lista de Inicio a Fin.\n" +
                                "4: Mostrar lista de Fin a Inicio.\n" +
                                "5: Eliminar el primer nodo.\n" +
                                "6: Eliminar el último nodo.\n" +
                                "7: Salir.\n" +
                                "¿Qué deseas hacer?", "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del nodo", "Agregando al inicio", JOptionPane.INFORMATION_MESSAGE));
                        listita.agregarAlInicio(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null ,
                                "Ingresa el elemento del nodo", "Agregando al final", JOptionPane.INFORMATION_MESSAGE));
                        listita.agregarAlFinal(elemento);
                        break;
                    case 3:
                        if (!listita.estaVacia()) {
                            listita.mostrarDeInicioAFin();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aún.",
                                    "Lista vacía.", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!listita.estaVacia()) {
                            listita.mostrarDeFinAInicio();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aún.",
                                    "Lista vacía.", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!listita.estaVacia()) {
                            elemento = listita.eliminarDelInicio();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento,
                                    "ELIMINANDO ELEMENTO DEL INICIO", JOptionPane.INFORMATION_MESSAGE);
                        } else
                            JOptionPane.showMessageDialog(null, "No hay nodos aún.",
                                    "Lista vacía.", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        if (!listita.estaVacia()) {
                            elemento = listita.eliminarDelFinal();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento,
                                    "ELIMINANDO ELEMENTO DEL FINAL", JOptionPane.INFORMATION_MESSAGE);
                        } else
                            JOptionPane.showMessageDialog(null, "No hay nodos aún.",
                                    "Lista vacía.", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
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
        } while (opcion != 7);
    }


}
