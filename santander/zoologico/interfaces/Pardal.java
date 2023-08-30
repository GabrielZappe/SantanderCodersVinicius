package santander.zoologico.interfaces;
public class Pardal extends Animal implements Voador {

    @Override
    public void voar() {
        System.out.println("Voando baixo");
    }

    @Override
    public void movimentar() {
        voar();
    }
}
