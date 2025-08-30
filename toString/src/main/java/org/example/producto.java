package org.example;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class producto {

        private int codigo;
        private String nombre;
        private double precio;

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            producto otro = (producto) obj;
            return this.codigo == otro.codigo;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(codigo);
        }

        @Override
        public String toString() {
            return "Producto{" +
                    "codigo=" + codigo +
                    ", nombre='" + nombre + '\'' +
                    ", precio=" + precio +
                    '}';
        }
    }

