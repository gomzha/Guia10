package Entidad;

public class Profesor extends Empleado{

    private String departamento;

    public Profesor(String nombre, String dni, String estadoCivil, int anioIncor, int numDespacho) {
        super(nombre, dni, estadoCivil, anioIncor, numDespacho);
    }

    public Profesor(String nombre, String dni, String estadoCivil, int anioIncor, int numDespacho, String departamento) {
        super(nombre, dni, estadoCivil, anioIncor, numDespacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void reasignoNuevoDepartamento(){
        System.out.println("Ingrese el nuevo departamento del profesor " + getNombre() + ": ");
        setDepartamento(leer.next());
        System.out.println("Se cambió el departamento de la persona " + getNombre());
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "departamento='" + departamento + '\'' +
                ", anioIncor=" + anioIncor +
                ", numDespacho=" + numDespacho +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
