import java.util.ArrayList;
import java.util.List;

public class Agrupador<T> {

    private final Sorteador1<T> sorteador1;

    public Agrupador(List<T> elementos) {
        this.sorteador1 = new Sorteador1<>(elementos);
    }

    public List<Grupo<T>> agrupar(int numeroDeGrupos) {
        List<Grupo<T>> grupos = inicializarGrupos(numeroDeGrupos);
        while (sorteador1.possuiElementos()) {
            for (Grupo<T> grupo : grupos) {
                grupo.adicionarNoGrupo(sorteador1.sortear());
                if (!sorteador1.possuiElementos()) break;
            }
        }
        return grupos;
    }

    private static <T> List<Grupo<T>> inicializarGrupos(int numeroDeGrupos) {
        List<Grupo<T>> grupos = new ArrayList<>();
        for (int i = 0; i < numeroDeGrupos; i++) {
            grupos.add(new Grupo(i));
        }
        return grupos;
    }
}