package semana2.dia10;

import java.util.Arrays;
import java.util.Stack;

public class AulaDia10 {

    static Stack<String> deck = new Stack<>();

    public static void main(String[] args) {

        adicionarCarta("As de paus");
        adicionarCarta("2 de ouros");
        adicionarCarta("6 de paus");
        adicionarCarta("3 de espadas");

        jogarCarta();
        jogarCarta();
    }

    static void adicionarCarta(String carta) {
        deck.push(carta);
        System.out.println("A carta " + carta + " foi adicionada ao deck!");

    }

    static String jogarCarta() {
        if(deck.isEmpty()) {
            System.out.println("O deck está vazio");
            return null;
        }
        String cartaJogada = deck.pop();
        System.out.println("A carta " + cartaJogada + " foi jogada!");
        return cartaJogada;
    }


}
