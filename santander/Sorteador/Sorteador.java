import java.util.Random;

public class Sorteador {
    private Random random;

    public Sorteador() {
        this.random = new Random();
    }

       public int sortear(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("O valor mínimo não pode ser maior que o valor máximo.");
        }

        return random.nextInt((max - min) + 1) + min;
    }


    public int[] agrupar(int min, int max, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade de sorteios deve ser maior que zero.");
        }

        int[] resultados = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            resultados[i] = sortear(min, max);
        }

        return resultados;
    }

    public static void main(String[] args) {
        Sorteador sorteador = new Sorteador();


        int[] numerosSorteados = sorteador.agrupar(1, 10, 5);
        System.out.println("Números sorteados: ");
        for (int numero : numerosSorteados) {
            System.out.println(numero);
        }
    }
}
