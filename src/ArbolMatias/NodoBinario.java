package ArbolMatias;

public class NodoBinario {
    private int llave;
    private String dato;
    private NodoBinario padre;
    private NodoBinario hijoIzquierdo;
    private NodoBinario hijoDerecho;

    public NodoBinario(int llave, String dato){
        this.llave = llave;
        this.dato = dato;
        this.padre = null;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoBinario getPadre() {
        return padre;
    }

    public void setPadre(NodoBinario padre) {
        this.padre = padre;
    }

    public NodoBinario getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoBinario hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoBinario getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoBinario hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public boolean esHoja(){
        return hijoDerecho == null && hijoIzquierdo == null;
    }

    public String informacionAString(){
        if(padre == null){
            return "NodoBinario{" +
                    "llave=" + llave +
                    ", dato='" + dato + '\'' +
                    ", padre="+ null +
                    ", hijoIzquierdo={ Llave " + hijoIzquierdo.getLlave() + ", Dato " + hijoIzquierdo.getDato() + "}" +
                    ", hijoDerecho={ Llave " + hijoDerecho.getLlave() + ", Dato " + hijoDerecho.getDato() + "}" +
                    '}';
        }else if(hijoIzquierdo != null && hijoDerecho == null){
            return "NodoBinario{" +
                    "llave=" + llave +
                    ", dato='" + dato + '\'' +
                    ", padre={ Llave " + padre.getLlave() + ", Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo={ Llave " + hijoIzquierdo.getLlave() + ", Dato " + hijoIzquierdo.getDato() +  "}" +
                    ", hijoDerecho=" + null +
                    '}';
        }else if(hijoIzquierdo == null && hijoDerecho != null){
            return "NodoBinario{" +
                    "llave=" + llave +
                    ", dato='" + dato + '\'' +
                    ", padre={ Llave " + padre.getLlave() + ", Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo="+ null +
                    ", hijoDerecho={ Llave " + hijoDerecho.getLlave() + ", Dato " + hijoDerecho.getDato() +  "}" +
                    '}';
        }else if(hijoIzquierdo == null && hijoDerecho == null) {
            return "NodoBinario{" +
                    "llave=" + llave +
                    ", dato='" + dato + '\'' +
                    ", padre={ Llave " + padre.getLlave() + ", Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo="+ null +
                    ", hijoDerecho=" + null +
                    '}';
        }else{
            return "NodoBinario{" +
                    "llave=" + llave +
                    ", dato='" + dato + '\'' +
                    ", padre={ Llave " + padre.getLlave() + ", Dato " + padre.getDato() + "}" +
                    ", hijoIzquierdo={ Llave" + hijoIzquierdo.getLlave() + ", Dato " + hijoIzquierdo.getDato() +  "}" +
                    ", hijoDerecho={ Llave " + hijoDerecho.getLlave() + ", Dato " + hijoDerecho.getDato() +  "}" +
                    '}';
        }
    }

    @Override
    public String toString() {
        return informacionAString();
    }
}
