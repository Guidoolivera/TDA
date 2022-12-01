package Grafos.GrafosB;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        String vertices[] = {"A", "B", "C", "D", "E", "F"};
        LinkedList aristas = new LinkedList();
        Grafo grafo = new Grafo(vertices);

        aristas.add("E");
        aristas.add("E");
        aristas.add("B");
        aristas.add("F");

        //grafo.conectar("A", aristas); //Punto 4: conexión a partir del conjunto de aristas
        grafo.conectar("A","B");
        grafo.conectar("A","E");
        grafo.conectar("A","F");
        grafo.conectar("B","C");
        grafo.conectar("B","E");//Punto 4: conexión a partir del conjunto de vertices
        grafo.conectar("C","B");
        grafo.conectar("C","D");
        grafo.conectar("C","E");
        grafo.conectar("D","E");
        grafo.conectar("D","F");
        grafo.conectar("E","A");
        grafo.conectar("F","D");
        grafo.conectar("F","E");

        System.out.println("La siguiente conexion tira error porque no se puede conectar mas de 2 veces cada par de nodos");
        grafo.conectar("A", "E"); //Punto 7

        grafo.imprimirListaAdyacencia();

        System.out.println("Eliminar conexion entre A y E");
        grafo.eliminarConexion("A", "E");

        grafo.imprimirListaAdyacencia();//Punto 10
        grafo.nodosProximos("F");//Punto 9
    }
}
