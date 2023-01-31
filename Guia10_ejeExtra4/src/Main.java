import Entidad.*;
import Servicio.ServicioEmpleado;
import Servicio.ServicioEmpleadoDeServicio;
import Servicio.ServicioEstudiante;
import Servicio.ServicioProfesor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personaArrayList = new ArrayList<>();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opcion = 0;
        boolean salir = false;


        do {
            System.out.println("------------Sistema Gestión Facultad------------");
            System.out.println("---Ingrese la opción deseada---");
            System.out.println("1-Nuevo Profesor ");
            System.out.println("2-Listar Profesores ");
            System.out.println("3-Nuevo Personal de servicio ");
            System.out.println("4-Listar Personal de servicio ");
            System.out.println("5-Nuevo Estudiante ");
            System.out.println("6-Listar Estudiantes ");
            System.out.println("7-SALIR");
            opcion = leer.nextInt();


            switch (opcion) {
                case 1 -> {
                    System.out.println("Usted eligió la opcion 1.");
                    personaArrayList.add(new ServicioProfesor().nuevoProfe());
                    break;
                }
                case 2 -> {
                    System.out.println("Usted eligió la opcion 2.");
                    listarIndividuos("PROFESOR", personaArrayList);
                    break;
                }
                case 3 -> {
                    System.out.println("Usted eligió la opcion 3.");
                    personaArrayList.add(new ServicioEmpleadoDeServicio().nuevoPersonalDeServicio());
                    break;
                }
                case 4 -> {
                    System.out.println("Usted eligió la opcion 4.");
                    listarIndividuos("EMPSERVICIO", personaArrayList);
                    break;
                }
                case 5 -> {
                    System.out.println("Usted eligió la opcion 5.");
                    personaArrayList.add(new ServicioEstudiante().nuevoEstudiante());
                    break;
                }
                case 6 -> {
                    System.out.println("Usted eligió la opcion 6.");
                    listarIndividuos("ESTUDIANTE", personaArrayList);
                    break;
                }
                case 7 -> {
                    salir = true;
                    break;
                }
                default -> {
                    System.out.println("Opcion incorrecta");
                }
            }

        } while (!salir);

        /*System.out.println("------------Ingresar nuevo estudiante------------");
        personaArrayList.add(new ServicioEstudiante().nuevoEstudiante());
        personaArrayList.add(new ServicioEstudiante().nuevoEstudiante());
        personaArrayList.add(new ServicioEmpleado().nuevoEmpleado());
        personaArrayList.add(new ServicioEmpleado().nuevoEmpleado());
*/

        for (Persona persona : personaArrayList) {

            if (persona instanceof Estudiante estudiante) {
                System.out.println("La persona es un estudiante:  " + estudiante.toString());
            }

            if (persona instanceof Empleado empleado) {
                System.out.println("La persona es un empleado:  " + empleado.toString());
            }
            System.out.println("____________________________");

        }

    }

    private static void listarIndividuos(String opcion, ArrayList<Persona> personaArrayList) {
        int vectorCont = 0;

        if (opcion.equals("PROFESOR")) {
            for (Persona persona : personaArrayList) {
                if (persona instanceof Profesor profesor) {
                    System.out.println("Profesor:  " + profesor.toString());
                    System.out.println("____________________________");
                    vectorCont++;
                }
            }
        } else if (opcion.equals("ESTUDIANTE")) {
            for (Persona persona : personaArrayList) {
                if (persona instanceof Estudiante estudiante) {
                    System.out.println("Estudiante:  " + estudiante.toString());
                    System.out.println("____________________________");
                    vectorCont++;
                }


            }
        } else if (opcion.equals("EMPSERVICIO")) {
            for (Persona persona : personaArrayList) {
                if (persona instanceof PersonalDeServicio personalDeServicio) {
                    System.out.println("Personal de Servicio:  " + personalDeServicio.toString());
                    System.out.println("____________________________");
                    vectorCont++;
                }
            }
        }

        if (vectorCont == 0){
            System.out.println("No se encuentra cargado ningún " + opcion);
        }

    }
}