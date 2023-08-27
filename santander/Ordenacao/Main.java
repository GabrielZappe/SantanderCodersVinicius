package ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ordenacao.Pessoa> pessoas = new ArrayList<>();

        ordenacao.Pessoa maria = new ordenacao.Pessoa("Maria", LocalDate.of(2003, Month.FEBRUARY, 28));
        ordenacao.Pessoa joao = new ordenacao.Pessoa("João", LocalDate.of(2000, Month.FEBRUARY, 9));

        pessoas.add(maria);
        pessoas.add(joao);

        System.out.println("Lista de pessoas:");
        System.out.println(pessoas);

        Collections.sort(pessoas);

        System.out.println("Lista ordenada por nome:");
        System.out.println(pessoas);

    }

}
