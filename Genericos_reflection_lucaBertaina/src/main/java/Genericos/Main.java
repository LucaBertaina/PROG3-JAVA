package Genericos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Caja<String> cajaString = new Caja<>("Luca");

        Caja<Integer> cajaInteger = new Caja<>(20);

        List<Caja> cajaLista = new ArrayList<>();
        cajaLista.add(cajaString);
        cajaLista.add(cajaInteger);
        System.out.println("Lista de cosas en caja: ");
        for (Caja caja : cajaLista) {
            System.out.println(caja.getContenido());
        }

        // list
        List<String> listaString = new ArrayList<>();
        listaString.add(cajaString.getContenido());
        listaString.add("Valen");
        listaString.add("Jero");
        //tira error listaString.add(cajaInteger.getContenido());

        System.out.println("========act 4========");

        ListasGenericas lectorListas = new ListasGenericas();

        List<Integer> listaInteger = new ArrayList<>();
        listaInteger.add(cajaInteger.getContenido());
        listaInteger.add(21);
        listaInteger.add(22);

        System.out.println("Lista de integer: ");
        lectorListas.imprimirLista(listaInteger);
        System.out.println("Lista de String: ");
        lectorListas.imprimirLista(listaString);

    }
}
