package GrafosB;

import java.util.LinkedList;

public class Grafo {

    int[][] matrizPesos;
    private String[] vertices;
    protected Vertice[] listaAdyacencia;

    public Grafo (String[] vertices){
        listaAdyacencia = new Vertice[vertices.length];
        this.vertices = vertices;
        for (int i = 0; i < vertices.length; i++){
            listaAdyacencia[i] = new Vertice(vertices[i]);
        }
    }

    public void conectar(String v1, LinkedList aristas){
        for (int i=0; i<vertices.length; i++){
            if (listaAdyacencia[i].getValor().equals(v1)){
                listaAdyacencia[i].setNodosAdyacentes(aristas);
            }
        }
    }

    public void conectar(String v1, String v2){
        for (int i=0; i<vertices.length; i++){
            if (listaAdyacencia[i].getValor().equals(v1)){
                if (listaAdyacencia[i].contarConexiones(v2) < 2){
                    listaAdyacencia[i].getNodosAdyacentes().add(v2);
                }else {
                    System.out.println("Los nodos ya tienen el máximo de conexiones (2)");
                }
            }else if (listaAdyacencia[i].getValor().equals(v2)){
                if (listaAdyacencia[i].contarConexiones(v1) < 2){
                    listaAdyacencia[i].getNodosAdyacentes().add(v1);
                }
            }
        }
    }

    public void eliminarConexion(String v1, String v2){
        for (int i=0; i<vertices.length; i++){
            if (listaAdyacencia[i].getValor().equals(v1)){
                listaAdyacencia[i].eliminarConexion(v2);
            }
            else if (listaAdyacencia[i].getValor().equals(v2)){
                listaAdyacencia[i].eliminarConexion(v1);
            }
        }
    }

    public void nodosProximos(String nodo){
        for (int i = 0; i<vertices.length; i++){
            if (listaAdyacencia[i].getValor().equals(nodo)){
                System.out.println("Nodos próximos al nodo " + nodo + " :" + listaAdyacencia[i].obtenerProximos());
            }
        }
    }

    public void imprimirListaAdyacencia(){
        for (int i=0; i<vertices.length; i++){
            System.out.println(listaAdyacencia[i].toString());
        }
    }

    private int busquedaIndex(String v){
        int result = -1;

        for (int i=0; i<vertices.length; i++){
            if (vertices[i].equals(v)){
                result = i;
                break;
            }
        }
        return result;
    }
}

