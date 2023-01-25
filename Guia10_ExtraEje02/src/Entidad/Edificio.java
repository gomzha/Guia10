package Entidad;

public abstract class Edificio {

    protected double ancho, largo, alto;


    public Edificio(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public abstract double calcularSuperficie();
    public abstract double calcularVolumen();

}
