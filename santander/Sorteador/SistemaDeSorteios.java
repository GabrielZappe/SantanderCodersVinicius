import java.util.ArrayList;
import java.util.List;

public class SistemaDeSorteios {
    public static void main(String[] args) {
        List<String> elementos  = new ArrayList<>();
        elementos.add("lARANJA");
        elementos.add("PITAYA");
        elementos.add("ABACAXI");
        elementos.add("KIWI");
        Agrupador<String> agrupador = new Agrupador<>(elementos);
        List<Grupo<String>> grupos = agrupador.agrupar(3);

        for (Grupo<String> grupo : grupos) {
            System.out.println(grupo.toSring());
        }
    }
}