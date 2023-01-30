package Entidad;

public class PersonalDeServicio  extends Empleado{

    private String seccion;

    public PersonalDeServicio(String nombre, String dni, String estadoCivil, int anioIncor, int numDespacho, String seccion) {
        super(nombre, dni, estadoCivil, anioIncor, numDespacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void trasladoSeccion(){
        System.out.println("Ingrese el traslado del personal de servicio " + getNombre() + ": ");
        setSeccion(leer.next());
        System.out.println("Se realizó el traslado de la persona " + getNombre());
    }

    @Override
    public String toString() {
        return "PersonalDeServicio{" +
                "seccion='" + seccion + '\'' +
                ", anioIncor=" + anioIncor +
                ", numDespacho=" + numDespacho +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
