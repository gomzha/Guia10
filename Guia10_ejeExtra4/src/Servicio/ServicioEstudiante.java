package Servicio;

import Entidad.Estudiante;
import Entidad.Persona;

import java.util.Scanner;

//• Matriculación de un estudiante en un nuevo curso.
public class ServicioEstudiante {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Estudiante nuevoEstudiante() {
        String curso;
        ServicioPersona servicioPersona = new ServicioPersona();
        Persona persona = servicioPersona.nuevaPersona();
        System.out.println("Ingrese el curso donde se encuentra matriculado: ");
        curso=leer.next();


        return new Estudiante(persona.getNombre(), persona.getDni(), persona.getEstadoCivil(),curso);
    }


}
