package santander.zoologico.interfaces;
import java.util.List;

public class Zoologico {

    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Amamentador amamentador = new Vaca();
        Golfinho golfinho = new Golfinho();
        Ornitorrinco ornitorrinco = new Ornitorrinco();
        Nadador tartaruga = new Tartaruga();

        List<Nadador> nadadores = List.of(golfinho, ornitorrinco, tartaruga);
        colocarNoTanqueParaNadar(nadadores);

    }

    private static void colocarNoTanqueParaNadar(List<Nadador> nadadores) {
        for (Nadador nadador: nadadores) {
            nadador.nadar();
        }
    }
}
