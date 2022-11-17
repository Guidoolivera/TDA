package Pilas2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        int elemento = 0;

        Pila pila = new Pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1: Empujar un elemento en la pila.\n" +
                                "2: Sacar el último elemento de la pila.\n" +
                                "3: Consultar si la pila está vacía.\n" +
                                "4: Consultar el último elemento de la pila\n" +
                                "5: Consultar tamaño de la pila.\n" +
                                "6: Vaciar pila.\n" +
                                "7: Salir.\n" +
                                "¿Qué desea hacer?:", "Menú de opciones", JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a empujar.",
                                "Apilando datos", JOptionPane.INFORMATION_MESSAGE));
                        pila.push(elemento);
                break;
                case 2:
                    if (!pila.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "El elemento desapilado es: "
                                + pila.pop(), "DESAPILANDO ELEMENTO", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "La pila está vacía.",
                                "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 3:
                    if (pila.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "La pila está vacía.",
                                "PILA VACIA", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "La pila no está vacía.",
                                "PILA CON ELEMENTOS", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 4:
                    if (!pila.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "El elemento de la cima es: "
                                + pila.obtenerCima(), "MOSTRANDO CIMA", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "La pila está vacía.",
                                "PILA VACIA", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "El tamaño de la pila es: "+ pila.tamaño,
                            "TAMAÑO DE LA PILA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                    if (!pila.estaVacia()){
                        pila.limpiarPila();
                        JOptionPane.showMessageDialog(null, "La pila se ha vaciado.",
                                "VACIANDO PILA", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "No hay nada para vaciar.",
                                "PILA VACIA", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Aplicación finalizada.", "FIN", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error: " + n.getMessage());
            }

        } while (opcion != 7);
    }
}
