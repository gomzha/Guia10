/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
        La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
        Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
        mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
        siguiente:
*/

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

public class Main {
    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();

        Animal perro2 = new Perro("teddy", "croquetas", 21, "chihuaha");
        perro2.Alimentarse();

        Animal gato1 = new Gato("peluza", "atun", 21, "calle");
        gato1.Alimentarse();

        Animal caballo1 = new Caballo("spark", "pasto", 25, "fino");
        caballo1.Alimentarse();
    }
}