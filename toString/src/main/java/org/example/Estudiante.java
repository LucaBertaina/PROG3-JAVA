package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estudiante extends persona {
        private String carrera;
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

        @Override
        public String toString() {
            return "Estudiante: " + getNombre() + ", Edad: " + getEdad() +
                    ", Carrera: " + carrera ;
        }
    }
