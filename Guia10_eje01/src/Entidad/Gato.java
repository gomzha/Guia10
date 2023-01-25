package Entidad;

public class Gato extends Animal{
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public void prueba1(){
        System.out.println("Hola, probadndo, nombre: " + nombre);

    }
}
