package Arboles;

import javax.swing.*;
import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        int valor;
        String nombre;
        ArbolBinario arbol = new ArbolBinario();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1: Agregar nodo.\n" +
                                "2: Recorrer inOrder.\n" +
                                "3: Recorrer en preOrder.\n" +
                                "4: Recorrer en posOrder.\n" +
                                "5: Buscar nodo en el árbol.\n" +
                                "6: Eliminar un nodo del arbol.\n" +
                                "7: Recorrer en anchura.\n" +
                                "8: Salir.\n" +
                                "Elige una opción...", "MENÜ", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del nodo.",
                                "AGREGANDO NODO", JOptionPane.INFORMATION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del nodo.",
                                "AGREGANDO NODO", JOptionPane.INFORMATION_MESSAGE);
                        arbol.agregarNodo(valor, nombre);
                        break;
                    case 2:
                        if (!arbol.estaVacio()) {
                            System.out.println();
                            arbol.inOrder(arbol.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol está vacío, no se puede recorrer.",
                                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!arbol.estaVacio()) {
                            System.out.println();
                            arbol.preOrder(arbol.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol está vacío, no se puede recorrer.",
                                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!arbol.estaVacio()) {
                            System.out.println();
                            arbol.posOrder(arbol.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol está vacío, no se puede recorrer.",
                                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!arbol.estaVacio()) {
                            valor = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el valor del  nodo buscado.",
                                    "BUSCANDO NODO", JOptionPane.INFORMATION_MESSAGE));
                            if (arbol.buscarNodo(valor) == null) {
                                JOptionPane.showMessageDialog(null, "El nodo " + valor + " no se encuentra en el árbol.",
                                        "NO ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                System.out.println("Se encontró el nodo. DATOS: " + arbol.buscarNodo(valor));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol está vacío, no se puede buscar.",
                                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if (!arbol.estaVacio()) {
                            valor = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el valor del  nodo a  eliminar.",
                                    "ELIMINANDO NODO", JOptionPane.INFORMATION_MESSAGE));
                            if (arbol.eliminarNodo(valor) == false) {
                                JOptionPane.showMessageDialog(null, "El nodo " + valor + " no se encuentra en el árbol.",
                                        "NO ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "El nodo " + valor + " ha sido eliminado del árbol.",
                                        "NODO ELIMINADO", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El árbol está vacío, no se puede buscar.",
                                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        if (!arbol.estaVacio()){
                            JOptionPane.showMessageDialog(null, "Recorriendo en anchura \n" + arbol.imprimirEnAnchura(),
                                    "BFS", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "El árbol está vacío, no se puede buscar.",
                                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada", "FIN", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error: " + n.getMessage());
            }

        } while (opcion != 8);
    }
}
