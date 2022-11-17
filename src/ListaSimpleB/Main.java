package ListaSimpleB;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        System.out.println("Esta vacia?: "+lista.estaVacia());

        lista.agregarPrimero(6);
        lista.agregarPrimero(5);
        lista.agregarPrimero(4);
        lista.agregarPrimero(3);
        lista.agregarPrimero(2);
        lista.agregarPrimero(1);

        lista.cortar(3);

        System.out.println("Esta vacia?: "+lista.estaVacia());
        System.out.println("Tamaño: " + lista.tamaño);

        //lista.eliminarPrimero();
        //lista.eliminarSegunIndice(2);
        System.out.println("Ultimo: " + lista.obtener(lista.tamaño-1));
    }
}
