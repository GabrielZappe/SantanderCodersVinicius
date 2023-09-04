import java.util.List;

public class SorteadorElementoMeio<T> {
    public T sortear(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }
        int meio = lista.size() / 2;
        return lista.get(meio);
    }

    public static void main(String[] args) {
        List<Integer> lista = List.of(44, 22, 13, 54, 35);
        SorteadorElementoMeio<Integer> sorteador = new SorteadorElementoMeio<>();
        Integer elementoSorteado = sorteador.sortear(lista);
        System.out.println("O numero do meio é: " + elementoSorteado);
    }
}
