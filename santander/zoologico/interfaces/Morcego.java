package santander.zoologico.interfaces;

public class Morcego extends Animal implements Voador, Amamentador {
    @Override
    void movimentar() {
        voar();
    }
}
