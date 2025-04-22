package semana2.dia11;

//O desafio é simular a navegação entre páginas em um navegador e implementar os botões "voltar" e "avançar" usando pilhas e as regras dessa
//funcionalidade tão comum em nosso dia a dia.

//1. Pilha de Voltar:
//Quando você navega de uma página para outra, a página atual é empurrada (pushed) para a pilha de voltar. Se você continuar navegando por várias páginas,
//elas serão empilhadas em ordem. Quando você clica no botão "voltar", o topo da pilha de voltar é retirado (popped) e a página é exibida.

//2. Pilha de Avançar:
//Quando você clica em "voltar", a página da qual você voltou é empurrada para a pilha de avançar. Se você clicar em "avançar", você tira (pop) da pilha de avançar
//e navega para essa página.
//
//1. Crie 3 funções, uma que controle o voltar, uma para o avançar e outra para navegar para um endereço.
//2. Controle a partir de 2 pilhas e uma variável que armazena o endereço da página atual.
//3. Nesse caso, se você achar necessário, pode utilizar as funções de arrays: push e pop ;)

import java.util.Stack;

public class Desafio_PilhaControleNavegadorWeb {


    static Stack<String> pilhaVoltar = new Stack<>();
    static Stack<String> pilhaAvancar = new Stack<>();
    static String paginaAtual;

    public static void main(String[] args) {

//        for(int i = 1; i <= 5; i++) {
//
//            navegarPara("Página_" + i);
//        }
//
//
//        System.out.println(pilhaVoltar);
//        System.out.println(paginaAtual);
//        voltar();
//        System.out.println(pilhaVoltar);
//        System.out.println(paginaAtual);
//        avancar();
//        System.out.println(pilhaAvancar);
//        System.out.println(pilhaVoltar);
//        System.out.println(paginaAtual);
//        voltar();
//        System.out.println(pilhaAvancar);
//        System.out.println(pilhaVoltar);
//        System.out.println(paginaAtual);
//        navegarPara("Página_6");
//        System.out.println(pilhaAvancar);
//        System.out.println(pilhaVoltar);
//        System.out.println(paginaAtual);


        navegarPara("Página_A");
        mostrarEstado();

        navegarPara("Página_B");
        mostrarEstado();

        navegarPara("Página_C");
        mostrarEstado();

        voltar(); // Voltando para Página_B
        mostrarEstado();

        voltar(); // Voltando para Página_A
        mostrarEstado();

        avancar(); // Avançando para Página_B
        mostrarEstado();

        navegarPara("Página_D");
        mostrarEstado();

        voltar(); // Voltando para Página_B
        mostrarEstado();

    }

    static void navegarPara(String novaPagina) {

        if(paginaAtual != null) {
            pilhaVoltar.push(paginaAtual);
        }

        pilhaAvancar.clear();
        paginaAtual = novaPagina;

        System.out.println(paginaAtual + " é a pagina atual!");
    }

    static void voltar() {

        if(pilhaVoltar.isEmpty()){
            System.out.println("Não há página para voltar!");
            return;
        }

        pilhaAvancar.push(paginaAtual);
        paginaAtual = pilhaVoltar.pop();
        System.out.println("Voltando para a " + paginaAtual);

    }

    static void avancar() {

        if(pilhaAvancar.isEmpty()) {
            System.out.println("Não há página para avançar!");
            return;
        }

        pilhaVoltar.push(paginaAtual);
        paginaAtual = pilhaAvancar.pop();
        System.out.println("Avançando para a " + paginaAtual);

    }

    static void mostrarEstado() {
        System.out.println("Página atual: " + paginaAtual);
        System.out.println("Pilha Voltar: " + pilhaVoltar);
        System.out.println("Pilha Avançar: " + pilhaAvancar);
        System.out.println("----------------------------");
    }


}
