package Lombok_DTO;

public record ProductoRecord(String codigo, String nombre, double precio) {
    public ProductoRecord(Producto producto) {
        this(producto.getCodigo(), producto.getNombre(), producto.getPrecio());
    }

}

