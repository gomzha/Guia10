import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Electrodomestico> arrayListElectrodomestico= new ArrayList<>();

        arrayListElectrodomestico.add(new Lavadora(2000, 30, "ROJO", "B",35));
        arrayListElectrodomestico.add(new Lavadora(2000, 30, "NEGRO", "B",35));
        arrayListElectrodomestico.add(new Lavadora(2000, 30, "AZUL", "B",35));
        arrayListElectrodomestico.add(new Televisor(2000, 30, "AZUL", "B",55,true));
        arrayListElectrodomestico.add(new Televisor(2000, 30, "NEGRO", "B",55,true));
        arrayListElectrodomestico.add(new Televisor(2000, 30, "ROJO", "B",55,true));


        for (Electrodomestico electrodomestico:arrayListElectrodomestico) {

            System.out.println("Electro: " + electrodomestico.toString());
            electrodomestico.precioFinal();
        }
        float precioTotalElectro = 0;
        for (Electrodomestico electrodomestico:arrayListElectrodomestico) {

            System.out.println("Electro: " + electrodomestico.toString());

        }
        for (Electrodomestico electrodomestico:arrayListElectrodomestico) {

            System.out.println("getPrecio: " + electrodomestico.toString());
            precioTotalElectro += electrodomestico.getPrecio();
        }
        System.out.println("El precio total de electro es: " + precioTotalElectro);
        /*Lavadora lavadora = new Lavadora();

        System.out.println(lavadora.toString());
        System.out.println("-----------------");
        lavadora.precioFinal();
        System.out.println("-----------------");
        System.out.println(lavadora.toString());


        Televisor televisor = new Televisor();
        System.out.println(televisor.toString());
        System.out.println("-----------------");
        televisor.precioFinal();
        System.out.println("-----------------");
        System.out.println(televisor.toString());
*/


    }
}