package santander.zoologico.interfaces;

public interface Voador {

    default void voar() {
        System.out.println("Voando");
    }
}
