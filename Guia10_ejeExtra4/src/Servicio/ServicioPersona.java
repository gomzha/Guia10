package Servicio;

import Entidad.Persona;

import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona nuevaPersona(){

        Persona persona = new Persona();
        System.out.println("Ingrese el NOMBRE de la persona: ");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el DNI de la persona: ");
        persona.setDni(leer.next());
        System.out.println("Ingrese el ESTADO CIVIL de la persona: ");
        persona.setEstadoCivil(leer.next());
        return persona;
    }

}