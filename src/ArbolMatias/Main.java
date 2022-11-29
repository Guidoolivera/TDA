package ArbolMatias;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbolito = new ArbolBinario();


        arbolito.insertar(new NodoBinario(10, "1"));
        arbolito.insertar(new NodoBinario(20, "2"));
        arbolito.insertar(new NodoBinario(15, "3"));
        arbolito.insertar(new NodoBinario(16, "4"));
        arbolito.insertar(new NodoBinario(7, "5"));
        arbolito.insertar(new NodoBinario(8, "6"));
        arbolito.insertar(new NodoBinario(33, "7"));
        arbolito.insertar(new NodoBinario(31, "8"));

        System.out.println("-----------------------");
        System.out.println(arbolito.buscar(33));
        System.out.println("-----------------------");
        System.out.println(arbolito.buscar(99));

        System.out.println("-----------------------");
        System.out.println(arbolito.getRaiz());

        System.out.println("-----------------------");
        arbolito.inOrden(arbolito.getRaiz());

        System.out.println("-----------------------");
        arbolito.preOrden(arbolito.getRaiz());

        System.out.println("-----------------------");
        arbolito.postOrden(arbolito.getRaiz());

        System.out.println("-----------------------");
        arbolito.eliminar(new NodoBinario(33,"7"));
        System.out.println(arbolito.buscar(33));

        System.out.println("-----------------------");
        System.out.println(arbolito.vacio());

        System.out.println("-----------------------");
        System.out.println(arbolito.buscar(31));

        System.out.println("-----------------------");
        arbolito.inOrden(arbolito.getRaiz());

    }
}
