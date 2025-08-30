package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("===================ACT 2==========================");
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("Juan", 20, "Ingeniería en Sistemas"));
        listaEstudiantes.add(new Estudiante("María", 22, "Diseño Gráfico"));
        listaEstudiantes.add(new Estudiante("Pedro", 21, "Medicina"));

        System.out.println(listaEstudiantes);
        //ACT 3

        System.out.println("===================ACT 3==========================");

        Curso curso1 = new Curso("Estructuras de Datos", "Prof. Carlos Ruiz");
        curso1.agregarEstudiante(new Estudiante("Juan", 20, "Ingeniería en Sistemas"));
        curso1.agregarEstudiante(new Estudiante("María", 22, "Diseño Gráfico"));
        curso1.agregarEstudiante(new Estudiante("Pedro", 21, "Medicina"));

        System.out.println(curso1);
    //ACT 4
        System.out.println("===================ACT 4==========================");
        ArrayList<producto> listaProductos = new ArrayList<>();

        producto Manzana = new producto(1, "Manzana", 10.5);
        producto Pera = new producto(2, "Pera", 12.0);
        producto Manzana_R = new producto(1, "Manzana Roja", 11.0);

        agregarProducto(listaProductos, Manzana);
        agregarProducto(listaProductos, Manzana_R);
        agregarProducto(listaProductos, Pera);
        System.out.println("Lista de productos Array");
        for (producto p : listaProductos) {
            System.out.println(p);
        }

        // ACT 5
        System.out.println("===================ACT 5==========================");
        HashSet<producto> listaProductosHash = new HashSet<>();

        listaProductosHash.add(Manzana);
        listaProductosHash.add(Manzana_R);
        listaProductosHash.add(Pera);
        System.out.println("Lista de productos HASH");
        for (producto p : listaProductosHash) {
            System.out.println(p);
        }
    }
    public static void agregarProducto(ArrayList<producto> lista, producto p) {
        if (!lista.contains(p)) {
            lista.add(p);
        }
    }
}