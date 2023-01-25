import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Edificio> edificioArrayList = new ArrayList<>();

        edificioArrayList.add(new Polideportivo(5,6,7, "rebote", "TECHADO"));
        edificioArrayList.add(new Polideportivo(4,5,6, "canepa", "sin techo"));
        edificioArrayList.add(new EdificioDeOficinas(2,3,4, 4, 30, 7));
        edificioArrayList.add(new EdificioDeOficinas(1,2,3, 2, 20, 4));

        int numOfi = 1;
        int numTech = 0;
        int numAbie = 0;
        for (Edificio edi:edificioArrayList) {

            if (edi instanceof EdificioDeOficinas) {
                System.out.println("La oficina num " + numOfi);
                EdificioDeOficinas o = (EdificioDeOficinas) edi;
                o.cantPersonas();
                System.out.println("La superficie es de: " + o.calcularSuperficie());
                System.out.println("El volumen es de: " + o.calcularVolumen());
                numOfi++;
            }

            if (edi instanceof Polideportivo) {
                Polideportivo p = (Polideportivo) edi;
                System.out.println("Polideportivo:  " + p.getNombre());
                System.out.println("La superficie es de: " + p.calcularSuperficie());
                System.out.println("El volumen es de: " + p.calcularVolumen());
                if(p.getTipoIns() == "TECHADO"){
                    numTech++;
                }else numAbie++;

            }
            System.out.println("____________________________");

        }
        System.out.println("Hay " + numTech + " polideportivos techados");
        System.out.println("Hay " + numAbie + " polideportivos abiertos");

    }
}