package Entidad;

public class Polideportivo extends Edificio{

    private String nombre, tipoIns;


    public Polideportivo(double ancho, double largo, double alto, String nombre, String tipoIns) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.tipoIns = tipoIns;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoIns() {
        return tipoIns;
    }

    public void setTipoIns(String tipoIns) {
        this.tipoIns = tipoIns;
    }

    @Override
    public String toString() {
        return "Polideportivo{" +
                "nombre='" + nombre + '\'' +
                ", tipoIns='" + tipoIns + '\'' +
                ", ancho=" + ancho +
                ", largo=" + largo +
                ", alto=" + alto +
                '}';
    }

    @Override
    public double calcularSuperficie() {

        return getAncho()*getLargo();
    }

    @Override
    public double calcularVolumen() {
        return getAncho()*getLargo()*getAlto();
    }
}
