package santander.zoologico.interfaces;

public class Ornitorrinco extends Animal implements Nadador, Amamentador {
    @Override
    void movimentar() {
        System.out.println("Andando");
    }
}
