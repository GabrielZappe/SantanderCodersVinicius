package santander.zoologico.heranca;

public class Morcego extends Mamifero {

    private void voar() {
        System.out.println("Voando");
    }

    @Override
    public void movimentar() {
        voar();
    }
}
