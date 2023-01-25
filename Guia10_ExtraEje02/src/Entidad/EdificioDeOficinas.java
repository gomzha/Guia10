package Entidad;

public class EdificioDeOficinas extends Edificio {

    private int numOfi, cantPerPorOfi, numPisos;

    public EdificioDeOficinas(double ancho, double largo, double alto, int numOfi, int cantPerPorOfi, int numPisos) {
        super(ancho, largo, alto);
        this.numOfi = numOfi;
        this.cantPerPorOfi = cantPerPorOfi;
        this.numPisos = numPisos;
    }

    public int getNumOfi() {
        return numOfi;
    }

    public void setNumOfi(int numOfi) {
        this.numOfi = numOfi;
    }

    public int getCantPerPorOfi() {
        return cantPerPorOfi;
    }

    public void setCantPerPorOfi(int cantPerPorOfi) {
        this.cantPerPorOfi = cantPerPorOfi;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public void cantPersonas(){
        System.out.println("En todo el edificio pueden trabajar: " + (getCantPerPorOfi()*getNumPisos()));
        System.out.println("Por piso pueden trabajar: " + getCantPerPorOfi());
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" +
                "numOfi=" + numOfi +
                ", cantPerPorOfi=" + cantPerPorOfi +
                ", numPisos=" + numPisos +
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
