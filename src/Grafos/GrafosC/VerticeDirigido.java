package Grafos.GrafosC;

import java.util.LinkedList;

public class VerticeDirigido {
    private String valor;
    private LinkedList<String> adyacentes;

    public VerticeDirigido(String valor){
        this.valor = valor;
        adyacentes = new LinkedList<>();
    }

    public String getValor() {
        return valor;
    }

    public void añadirAdyacente(String verticeAdyacente){
        adyacentes.add(verticeAdyacente);
    }

    public void eliminarAdyacente(String verticeAdyacente){

        for (String vertice:adyacentes) {
            if(vertice.equals(verticeAdyacente)){
                adyacentes.remove(vertice);
            }
        }
    }

    @Override
    public String toString() {
        return valor + "| "  + adyacentes;
    }
}