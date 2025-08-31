package org.example;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // ACT 1
        System.out.println("===================ACT 1==========================");
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Juan", 8.5));
        listaAlumnos.add(new Alumno("María", 9.0));
        listaAlumnos.add(new Alumno("Pedro", 7.5));

        for (Alumno a : listaAlumnos) {
            System.out.println(a);
        }
        // ACT 2
        System.out.println("===================ACT 2==========================");
        HashSet<Producto> setProductos = new HashSet<>();

        Producto prod1 = new Producto(101, "Teclado");
        Producto prod2 = new Producto(102, "Mouse");
        Producto prod3 = new Producto(101, "Teclado mecánico");
        Producto prod4 = new Producto(103, "Monitor");

        setProductos.add(prod1);
        setProductos.add(prod2);
        setProductos.add(prod3);
        setProductos.add(prod4);

        for (Producto p : setProductos) {
            System.out.println(p);
        }
        // ACT 3
        System.out.println("===================ACT 3==========================");
        HashMap<String, Curso> cursos = new HashMap<>();

        cursos.put("LIQ", new Curso("Programacion 4", "Prof. Alverto Cortez"));
        cursos.put("LIMB", new Curso("Estadistica", "Prof. Cristian Mut"));
        cursos.put("LIE", new Curso("Programación en Java", "Prof. Luciano Chiroli"));


        String codigoBuscado = "LIQ";
        Curso cursoRecuperado = cursos.get(codigoBuscado);
        System.out.println("Curso recuperado con clave " + codigoBuscado + ": " + cursoRecuperado);

        System.out.println("\nLista de todos los cursos:");
        for (Map.Entry<String, Curso> entry : cursos.entrySet()) {
            System.out.println("Código: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}