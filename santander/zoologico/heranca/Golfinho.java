package santander.zoologico.heranca;

public class Golfinho extends Mamifero {


    public void nadar() {
        System.out.println("Nadando");
    }

    @Override
    public void movimentar() {
        nadar();
    }
}
