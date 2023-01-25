import java.util.ArrayList;

public class Main implements ClaseInterfaz{
    public static void main(String[] args) {
        ArrayList<Animal> animalArrayList = new ArrayList<>();

        Animal a = new Animal();
        Animal b = new Gato();
        Perro c = new Perro();

        //a.hacerRuido();
        b.hacerRuido();
        c.hacerRuido();
        System.out.println("----");
        animalArrayList.add(a);
        animalArrayList.add(b);
        animalArrayList.add(c);

        for (Animal animal:animalArrayList) {
            animal.hacerRuido();
        }

        //instancio a una clase interface donde automáticamente me rellena los métodos que se encuentren en ella
        ClaseAbstracta claseAbstracta = new ClaseAbstracta() {
            @Override
            public void holaMundo() {

            }

            @Override
            public void chauMundo() {

            }
        };

        ClaseAbstracta claseAbstracta1 = new ClaseAbstracta() {
            @Override
            public void holaMundo() {

            }

            @Override
            public void chauMundo() {

            }
        };

        //instancio a una clase llamada Clase que dentro de ella implementa la interfaz ClaseAbstracta
        Clase clase = new Clase();
        clase.holaMundo();
        clase.chauMundo();

        claseAbstracta.holaMundo();






    }

    @Override
    public void holaPepe() {
        System.out.println("variable: " + VARIABLE_ENTERA);

    }

    @Override
    public void chauPepe() {

    }
}