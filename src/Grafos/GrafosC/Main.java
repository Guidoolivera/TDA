package Grafos.GrafosC;

public class Main {
    public static void main(String[] args) {

        String[] vertices = {"A","B","C"};
        GrafoNoDirigido g1 = new GrafoNoDirigido(vertices);
        g1.conectar("A","B");
        g1.conectar("B","C");
        g1.conectar("C","A");

        g1.imprimirMatriz();
        g1.conocerConexion("A","B");
        g1.conocerConexion("B","A");
        g1.conocerConexion("A","C");

    }
}
