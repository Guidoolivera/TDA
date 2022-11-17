package Grafos;

public class Main {
    public static void main(String[] args) {
        //Ingresar la matriz de pesos
        long matrizA[][]={{0,3,4,999999999,8,999999999}, {999999999,0,999999999,
                999999999,5,999999999}, {999999999, 999999999, 0, 999999999, 3, 999999999},
                {999999999,999999999,999999999,0,999999999,999999999}, {999999999, 999999999,
                999999999, 7, 0, 3}, {999999999, 999999999, 999999999, 2, 999999999, 0}};
        CaminosMinimos ruta= new CaminosMinimos();
        System.out.println(ruta.algoritmoFloyd(matrizA));
    }
}

