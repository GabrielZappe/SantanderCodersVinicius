package santander.zoologico.interfaces;

public class Tartaruga extends Animal implements Nadador{
    @Override
    void movimentar() {
        nadar();
    }
}
