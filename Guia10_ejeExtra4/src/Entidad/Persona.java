package Entidad;

import java.util.Scanner;

public class Persona {
    protected String nombre, dni, estadoCivil;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona() {
    }

    public Persona(String nombre, String dni, String estadoCivil) {
        this.nombre = nombre;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void cambioEstCivil(){
        System.out.println("Ingrese el nuevo estado civil de " + getNombre() + ": ");
        setEstadoCivil(leer.next());
        System.out.println("Se cambió el estado de la persona " + getNombre());
    }


}
