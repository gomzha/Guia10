package Entidad;

public class Circulo implements CalculoFormas{
    double radio, diametro;
    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public Circulo() {
    }
    @Override
    public double area() {
        return (constante * (getRadio() * getRadio()));
    }

    @Override
    public double perimetro() {
        return (constante * getDiametro());
    }
}
