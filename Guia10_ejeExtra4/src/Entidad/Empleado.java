package Entidad;

public class Empleado extends Persona{

    protected int anioIncor, numDespacho;

    public Empleado(String nombre, String dni, String estadoCivil, int anioIncor, int numDespacho) {
        super(nombre, dni, estadoCivil);
        this.anioIncor = anioIncor;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncor() {
        return anioIncor;
    }

    public void setAnioIncor(int anioIncor) {
        this.anioIncor = anioIncor;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "anioIncor=" + anioIncor +
                ", numDespacho=" + numDespacho +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }

    public void reasignoNuevoDespacho(){
        System.out.println("Ingrese el nuevo despacho de " + getNombre() + ": ");
        setNumDespacho(leer.nextInt());
        System.out.println("Se cambió el despacho de la persona " + getNombre());
    }

}
