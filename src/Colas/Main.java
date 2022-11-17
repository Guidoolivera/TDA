package Colas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        int elemento = 0;

        Cola cola = new Cola();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1: Encolar elemento.\n" +
                                "2: Desencolar un elemento.\n" +
                                "3: Consultar si la cola está vacía.\n" +
                                "4: Consultar el primer elemento de la cola.\n" +
                                "5: Consultar tamaño de la cola.\n" +
                                "6: Salir.\n", "MENÚ DE OPCIONES", JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a encolar.",
                                "ENCOLANDO", JOptionPane.INFORMATION_MESSAGE));
                        cola.encolar(elemento);
                        break;
                    case 2:
                        if (!cola.estaVacia()) {
                            JOptionPane.showInputDialog(null, "El elemento desencolado es: "
                                            + cola.desencolar(),
                                    "DESENCOLANDO", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showInputDialog(null, "La cola está vacía.",
                                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (cola.estaVacia()) {
                            JOptionPane.showInputDialog(null, "La cola está vacía.",
                                    "ESTADO DE LA COLA", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            JOptionPane.showInputDialog(null, "La cola no está vacía.",
                                    "ESTADO DE LA COLA", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 4:
                        if (!cola.estaVacia()) {
                            JOptionPane.showInputDialog(null, "El elemento ubicado al inicio es: "
                                            + cola.obtenerPrimero(),
                                    "PRIMER ELEMENTO", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showInputDialog(null, "La cola está vacía.",
                                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showInputDialog(null, "El tamaño de la cola es: " + cola.obtenerTamaño(),
                                "TAMAÑO DE LA COLA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showInputDialog(null, "Aplicación finalizada.",
                                "FIN", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showInputDialog(null, "Opción incorrecta",
                                "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "ERROR: " + n.getMessage());
            }

        } while (opcion != 6);
    }
}
