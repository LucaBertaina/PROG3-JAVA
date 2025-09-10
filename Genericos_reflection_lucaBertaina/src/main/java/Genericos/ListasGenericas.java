package Genericos;

import java.util.List;

public class ListasGenericas {
    public ListasGenericas() {

    }
    public static <T> void imprimirLista(List<T> lista) {
        System.out.println("esta es una lista del tipo " + lista.getClass().getSimpleName());
        for (T elemento : lista) {
            System.out.println(elemento+ " " + elemento.getClass().getSimpleName());
        }
    }
}
