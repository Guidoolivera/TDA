package GrafosB;

import java.util.LinkedList;


public class Vertice {

    public String valor;
    public LinkedList nodosAdyacentes;

    public Vertice(String valor){
        this.valor = valor;
        nodosAdyacentes = new LinkedList();
    }

    public String getValor(){
        return valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public LinkedList getNodosAdyacentes(){
        return nodosAdyacentes;
    }

    public void setNodosAdyacentes(LinkedList nodosAdyacentes){
        this.nodosAdyacentes = nodosAdyacentes;
    }

    public void eliminarConexion(String nodo){
        for (Object vertice : nodosAdyacentes){
            if (vertice.equals(nodo)){
                nodosAdyacentes.remove();
                break;
            }
        }
    }

    public int contarConexiones(String nodo){
        int contador = 0;
        for (Object vertice:nodosAdyacentes){
            if (vertice.equals(nodo)){
                contador++;
            }
        }
        return contador;
    }

    public String obtenerProximos(){
        return nodosAdyacentes.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertice)) return false;

        Vertice vertice = (Vertice) o;

        return getValor().equals(vertice.getValor());
    }

    @Override
    public int hashCode() {
        return getValor().hashCode();
    }

    @Override
    public String toString() {
        return valor + "|" + nodosAdyacentes.toString();
    }
}
