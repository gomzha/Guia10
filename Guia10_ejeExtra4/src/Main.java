import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Servicio.ServicioEmpleado;
import Servicio.ServicioEstudiante;
import Servicio.ServicioPersona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------Sistema Gestión Facultad------------");

        ArrayList<Persona> personaArrayList = new ArrayList<>();

        System.out.println("------------Ingresar nuevo estudiante------------");
        personaArrayList.add(new ServicioEstudiante().nuevoEstudiante());
        personaArrayList.add(new ServicioEstudiante().nuevoEstudiante());
        personaArrayList.add(new ServicioEmpleado().nuevoEmpleado());
        personaArrayList.add(new ServicioEmpleado().nuevoEmpleado());


        for (Persona persona:personaArrayList) {

            if (persona instanceof Estudiante estudiante) {
                System.out.println("La persona es un estudiante:  " + estudiante.toString());
            }

            if (persona instanceof Empleado empleado) {
                System.out.println("La persona es un empleado:  " + empleado.toString());
            }
            System.out.println("____________________________");

        }




    }
}