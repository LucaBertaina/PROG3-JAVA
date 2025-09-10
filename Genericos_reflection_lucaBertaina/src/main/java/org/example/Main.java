package org.example;

import java.lang.reflect.*;


public class Main {
    public static void main(String[] args) throws Exception{

        Class<?> clase = Class.forName("org.example.Persona");
        Constructor<?>[] constructores = clase.getConstructors();
        System.out.println("Constructores de Persona:");
        for (Constructor<?> c : constructores) {
            System.out.println(c);
        }

        Object personaRef = clase.getDeclaredConstructor().newInstance();

        Field nombreField = clase.getDeclaredField("nombre");
        nombreField.setAccessible(true);
        nombreField.set(personaRef,"luca");
        Field edadField = clase.getDeclaredField("edad");
        edadField.setAccessible(true);
        edadField.set(personaRef,20);

        Method saludar = clase.getMethod("saludar");
        saludar.invoke(personaRef);

        Method info = clase.getDeclaredMethod("mostrarInfo");
        info.setAccessible(true);
        info.invoke(personaRef);
    }
}