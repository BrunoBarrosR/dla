package dia6;

public class Desafio03_AplicacaoFinanceira {
    /*
    Para o desafio 3, quero que você volte ao dia 5 no desafio 1 sobre rendimento de aplicação financeira e
    crie uma função que fará to-do o cálculo, conforme detalhamos no desafio.
    Você tem um valor inicial de uma aplicação financeira que rende um percentual ao ano.
    Calcule como esse investimento cresce ao longo do tempo ao ano.
    */

    public static void main(String[] args) {

        double investimento = 1000.0;
        double taxaJuros = 12.0;
        int anosInvestimento = 10;

        calculoAplicacao(investimento, taxaJuros, anosInvestimento);


    }

    public static void calculoAplicacao(double investimento, double taxaJuros, int anosInvestimento) {

       for(int i = 1; i <= anosInvestimento; i++) {
           investimento = investimento + (investimento * taxaJuros / 100);
           System.out.printf("Seu investimento em %d ano(s) é igual a: R$ %.2f%n", i, investimento);
       }
    }
}
