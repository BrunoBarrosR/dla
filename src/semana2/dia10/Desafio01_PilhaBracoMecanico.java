package semana2.dia10;

import java.util.Stack;

public class Desafio01_PilhaBracoMecanico {

    static Stack<String> caixa = new Stack<>();

    public static void main(String[] args) {

        for(int i = 1; i <= 40; i++) {
            empilhar("produto-" + i);
        }

    }

    static void empilhar(String produtos) {
        if (verificarCaixaCheia()) {
            System.out.println("A caixa está cheia!");
            System.out.println("Caixa será selada e despachada.");
            System.out.println(caixa);
            System.out.println("Uma nova caixa será criada!");

            caixa = criarNovaCaixa();
            System.out.println("O produto " + produtos + " foi empilhado na caixa!");
            caixa.push(produtos);
        } else {
            caixa.push(produtos);
            System.out.println("O produto " + produtos + " foi empilhado na caixa!");
        }


    }


    static boolean verificarCaixaCheia() {
        return caixa.size() >= 10;
    }

    static Stack<String> criarNovaCaixa() {
        return new Stack<>();
    }
}
