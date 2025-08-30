package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class persona {
    private String nombre;
    private int edad;

    @Override
    public String toString() {
        return "Persona: " + this.nombre + ", Edad: " + this.edad;
    }
}
