package Lombok_DTO.DTO;
import Lombok_DTO.Producto;

public class ProductoDTO {
    private String codigo;
    private String nombre;
    private double precio;

    public ProductoDTO() {}

    public ProductoDTO(Producto producto) {
        this.codigo = producto.getCodigo();
        this.nombre = producto.getNombre();
        this.precio = producto.getPrecio();
    }

    public void setProducto(Producto producto) {
        this.codigo = producto.getCodigo();
        this.nombre = producto.getNombre();
        this.precio = producto.getPrecio();
        System.out.println("se actualizo el DTO");
    }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

