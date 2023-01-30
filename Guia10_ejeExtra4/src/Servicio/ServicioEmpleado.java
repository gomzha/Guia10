package Servicio;

import Entidad.Empleado;
import Entidad.Persona;

import java.util.Scanner;

public class ServicioEmpleado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Empleado nuevoEmpleado(){
        int anioIncorporacion, numDespacho;
        ServicioPersona servicioPersona = new ServicioPersona();
        Persona persona = servicioPersona.nuevaPersona();

        System.out.println("Ingrese el año de incorporación: ");
        anioIncorporacion = leer.nextInt();
        System.out.println("Ingrese el número de despacho: ");
        numDespacho = leer.nextInt();

        return new Empleado(persona.getNombre(), persona.getDni(), persona.getEstadoCivil(), anioIncorporacion, numDespacho);
    }

}
