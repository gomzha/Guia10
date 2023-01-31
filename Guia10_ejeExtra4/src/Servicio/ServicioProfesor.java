package Servicio;

import Entidad.Empleado;
import Entidad.Persona;
import Entidad.Profesor;

import java.util.Scanner;

public class ServicioProfesor {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Profesor nuevoProfe(){
        String departameto;
        ServicioEmpleado servicioEmpleado = new ServicioEmpleado();
        Empleado empleado = servicioEmpleado.nuevoEmpleado();
        System.out.println("Ingrese el departamento al que pertenece: ");
        departameto = leer.next();

        return new Profesor(empleado.getNombre(), empleado.getDni(), empleado.getEstadoCivil(), empleado.getAnioIncor(), empleado.getNumDespacho(), departameto);
    }


}
