package Lombok_DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    private String nombre;
    private int edad;

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + this.nombre + ", edad=" + this.edad + '}';
    }
}
