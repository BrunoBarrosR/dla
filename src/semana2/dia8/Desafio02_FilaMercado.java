package semana2.dia8;

import java.util.Arrays;

public class Desafio02_FilaMercado {
    //O segundo desafio será codificar uma fila do mundo real. Nós escolhemos uma fila de supermercado.
    //Esse conceito é interessante, pois em um supermercado se forma a fila a partir de caixas individuais, diferentemente dos bancos onde existe apenas uma fila para diversos caixas.
    //
    //Comece com a formação de uma fila a partir de um único caixa em um mercado e depois, em outro momento, vamos expandir o conceito para filas em
    //diversos caixas. Pense agora em quantas operações podem existir nessa fila.
    //
    //Dica: Nós entramos na fila e depois somos atendidos. Ou seja, nós somos adicionados à fila e depois nós saímos da fila.


    static String[] fila = new String[10];
    static int pessoasFila = 0;


    public static void main(String[] args) {

        entrarNaFila("Mário");
        entrarNaFila("Marta");
        entrarNaFila("Marcí");
        entrarNaFila("Mariano");
        mostrarFila();
        serAtentido();
        mostrarFila();
        serAtentido();
        mostrarFila();
        serAtentido();
        mostrarFila();
        serAtentido();
        mostrarFila();
        serAtentido();
        mostrarFila();

    }

    public static void entrarNaFila(String cliente) {
        if (pessoasFila < fila.length) {
            fila[pessoasFila] = cliente;
            pessoasFila ++;
            System.out.println(cliente + " entrou na fila!");
        } else {
            System.out.println("A fila está cheia!");
        }
    }

    public static void mostrarFila() {
        System.out.println(Arrays.toString(fila));
    }

    public static void serAtentido() {
        if (pessoasFila > 0) {
            String clienteAtendido = fila[0];

            for (int i = 1; i < pessoasFila; i++) {
                fila[i - 1] = fila[i];

            }

            pessoasFila--;
            // "Limpa" a última posição que passou a ser redundante
            fila[pessoasFila] = null;
            System.out.println(clienteAtendido + " foi atendido!");

        } else {
            System.out.println("Não há pessoas na fila para ser atendida!");
        }
    }
}
