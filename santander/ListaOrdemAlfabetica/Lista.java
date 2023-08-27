import java.util.ArrayList;
import java.util.Collections;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Alan");
        lista.add("Samuel");
        lista.add("Mayara");
        lista.add("Gabriel");

        System.out.println("Lista original:");
        System.out.println(lista);

        ordenarListaAlfabeticamente(lista);

        System.out.println("Lista ordenada em ordem alfabética:");
        System.out.println(lista);
    }

    public static void ordenarListaAlfabeticamente(ArrayList<String> lista) {
        Collections.sort(lista);
    }
}
