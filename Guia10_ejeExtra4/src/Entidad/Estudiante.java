package Entidad;

public class Estudiante extends Persona{

    private String curso;

    public Estudiante(String nombre, String dni, String estadoCivil) {
        super(nombre, dni, estadoCivil);
    }

    public Estudiante(String nombre, String dni, String estadoCivil, String curso) {
        super(nombre, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "curso='" + curso + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
