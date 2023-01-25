package Entidad;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected float precio, peso;
    protected String color, consumoE;

    public Electrodomestico() {

    }

    public Electrodomestico(float precio, float peso, String color, String consumoE) {
        this.precio = precio;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoE);
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(String consumoE) {
        this.consumoE = consumoE;
    }

    private void comprobarConsumoEnergetico(String letra){

        letra = letra.toUpperCase();
        if (!letra.equals("A") && !letra.equals("B") && !letra.equals("C") && !letra.equals("D") && !letra.equals("E") && !letra.equals("F")){
            this.consumoE = "F";
        } else this.consumoE = letra;
    }

    private void comprobarColor(String color){

        color = color.toUpperCase();
        if (!color.equals("BLANCO") && !color.equals("NEGRO") && !color.equals("ROJO") && !color.equals("AZUL")&& !color.equals("GRIS")){
            this.color = "BLANCO";
        } else this.color = color;
    }


    public void crearElectrodomestico(){
        System.out.println("Ingrese su color");
        comprobarColor(leer.next());

        System.out.println("Ingrese su consumo");
        comprobarConsumoEnergetico(leer.next());

        System.out.println("Ingrese su peso");
        this.peso = leer.nextFloat();

        this.precio = 1000;
    }

    public void precioFinal(){
        //  System.out.println(getPrecio());
        if(this.peso >= 1 && this.peso <= 19){
            this.precio+=100;
        }
        //   System.out.println(getPrecio());

        if(this.peso >= 20 && this.peso <= 49){
            this.precio+=500;
        }
        //   System.out.println(getPrecio());

        if(this.peso >= 50 && this.peso <= 79){
            this.precio+=800;
        }
        //   System.out.println(getPrecio());

        if(this.peso >= 80){
            this.precio+=1000;
        }
        //  System.out.println(getPrecio());

        if(this.consumoE.equals("A")){
            this.precio+=900;
        }
        //    System.out.println(getPrecio());

        if(this.consumoE.equals("B")){
            this.precio+=800;
        }
        //   System.out.println(getPrecio());

        if(this.consumoE.equals("C")){
            this.precio+=600;
        }
        //    System.out.println(getPrecio());

        if(this.consumoE.equals("D")){
            this.precio+=500;
        }
        //   System.out.println(getPrecio());

        if(this.consumoE.equals("E")){
            this.precio+=300;
        }
       // System.out.println(getPrecio());

        if(this.consumoE.equals("F")){
            this.precio+=100;
        }
     //   System.out.println(getPrecio());



    }


}
