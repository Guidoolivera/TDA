package Grafos.GrafosMattof;

public class Main {
    public static void main(String[] args) {

        String[] vertices = {"A", "B", "C", "D"};
        Grafo g1 = new Grafo(vertices);
        g1.conectar("A","B", 5);
        g1.conectar("B","C");
        g1.conectar("C","D");
        g1.conectar("A","D");

        g1.imprimir();

    }
}
