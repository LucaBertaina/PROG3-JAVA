package org.example;
import java.util.ArrayList;
import java.util.List;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Curso {
    private String nombre;
    private String profesor;
    private List<Estudiante> estudiantes;


    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }
    public void eliminarEstudiante(Estudiante estudiante){
        this.estudiantes.remove(estudiante);
    }

    @Override
    public String toString() {
        return "Curso: " + this.nombre + ", Profesor: " + this.profesor + ", Estudiantes: " + estudiantes.size();
    }

}
