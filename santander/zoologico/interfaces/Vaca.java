package santander.zoologico.interfaces;

public class Vaca extends Animal implements Amamentador {
    @Override
    void movimentar() {
        System.out.println("Andando");
    }
}
