package Entidad;

public class Animal {

     protected String nombre, alimento, raza;   //si lo pongo private no funciona en las clases hijas, o sea,
                                                // no puedo acceder a dichos nombres
     int edad;

    public Animal(String nombre, String alimento,int edad , String raza ) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public void Alimentarse(){

         System.out.println(this.nombre + " se alimenta de " + this.alimento);

     }

}
