package Servicio;

import Entidad.Empleado;
import Entidad.PersonalDeServicio;
import Entidad.Profesor;

import java.util.Scanner;

public class ServicioEmpleadoDeServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public PersonalDeServicio nuevoPersonalDeServicio(){
        String seccion;
        ServicioEmpleado servicioEmpleado = new ServicioEmpleado();
        Empleado empleado = servicioEmpleado.nuevoEmpleado();
        System.out.println("Ingrese la seccion al que pertenece: ");
        seccion = leer.next();

        return new PersonalDeServicio(empleado.getNombre(), empleado.getDni(), empleado.getEstadoCivil(), empleado.getAnioIncor(), empleado.getNumDespacho(), seccion);
    }
}
