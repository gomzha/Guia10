package Entidad;

public class Rectangulo implements CalculoFormas{

    private double base, altura;


    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return getBase() * getAltura() ;
    }

    @Override
    public double perimetro() {
        return (getBase() + getAltura()) / 2 ;
    }
}
