package Lombok_DTO;


import Lombok_DTO.DTO.ProductoDTO;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============ACT 1=============");
        Persona persona = new Persona("Luca",20);
        Persona persona2 = new Persona();

        System.out.println(persona);
        System.out.println(persona2);
        System.out.println("=============ACT 2=============");
        Usuario usuario1 = Usuario.builder()
                .id(1L)
                .nombre("Jeronimo Zuñiga")
                .email("Jzuñiga@example.com")
                .build();

        Usuario usuario2 = Usuario.builder()
                .id(2L)
                .nombre("Valentino Lorca")
                .email("Vlorca@example.com")
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println("=============ACT 3=============");
        Producto p1 = new Producto("123","Terere",12.3,"Luca");
        Producto p2 = new Producto("1323","Mate",1222.3,"jero");
        Producto p3 = new Producto("223","Yerbeado",3332.3,"Valen");
        ProductoDTO pDTO1 = new ProductoDTO(p1);
        ProductoDTO pDTO2 = new ProductoDTO(p2);
        ProductoDTO pDTO3 = new ProductoDTO(p3);

        List<ProductoDTO> listaDTO = new ArrayList<>();
        listaDTO.add(pDTO1);
        listaDTO.add(pDTO2);
        listaDTO.add(pDTO3);

        for (ProductoDTO productoDTO : listaDTO) {
            System.out.println(productoDTO);
        }

        System.out.println("=============ACT 4=============");

        ProductoRecord productoRecord = new ProductoRecord(p2);
        ProductoRecord productoRecord2 = new ProductoRecord(p3);
        ProductoRecord productoRecord3 = new ProductoRecord(p1);

        List<ProductoRecord> listaRecord = new ArrayList<>();
        listaRecord.add(productoRecord);
        listaRecord.add(productoRecord2);
        listaRecord.add(productoRecord3);
        for (ProductoRecord prodctoRecord : listaRecord) {
            System.out.println(prodctoRecord);
        }
    }
}