import java.util.List;

public class SorteadorUltimoElemento<T> {
    public T sortear(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }
        return lista.get(lista.size() - 1);
    }

    public static void main(String[] args) {
        List<Integer> lista = List.of(561, 722, 333, 140, 455);
        SorteadorUltimoElemento<Integer> sorteador = new SorteadorUltimoElemento<>();
        Integer elementoSorteado = sorteador.sortear(lista);
        System.out.println("Ultimo numero é: " + elementoSorteado);
    }
}
