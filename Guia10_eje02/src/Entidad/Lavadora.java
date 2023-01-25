package Entidad;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private float carga;

    public Lavadora() {
        crearLavadora();
    }

    public Lavadora(float precio, float peso, String color, String consumoE, float carga) {
        super(precio, peso, color, consumoE);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public void crearLavadora(){
        crearElectrodomestico();
        System.out.println("Ingresar la carga del lavarropas: ");
        setCarga(leer.nextFloat());
    }
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", consumoE='" + consumoE + '\'' +
                '}';
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        System.out.println("vuelta de precio final lavadora: " + getPrecio());

        if (getCarga() > 30){
            setPrecio(500 + getPrecio());
        }
        System.out.println("precio final lavadora: " + getPrecio());

    }


}
