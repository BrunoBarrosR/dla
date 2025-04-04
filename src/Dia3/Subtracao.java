package Dia3;

import java.time.LocalDate;

public class Subtracao {

    public static void main(String[] args) {

        //1. Imagine que você tem algumas variáveis com compras no cartão de crédito, e uma com um valor a ser estornado de uma compra errada, calcule o total da fatura atualizado.

        double compra1 = 150.00;
        double compra2 = 35.00;
        double compra3 = 45.00;

        double total = compra1 + compra2 + compra3;
        System.out.println("Total da compra: R$ " + total);

        // estorno da compra3
        double totalFinal = total - compra3;
        System.out.println("Total da fatura atualizada: R$ "+ totalFinal);


        //2. Calcule a sua idade a partir de duas variáveis contendo o ano de nascimento e o ano atual.
        int anoAtual = LocalDate.now().getYear();
        int anoNascimento = 1987;

        int idade = anoAtual - anoNascimento;

        System.out.println();
        System.out.println("Em " + anoAtual + " você terá: " );
        System.out.println(idade + " anos.");


        // 3. Imagine que em um jogo você tenha um total de moedas e para cada vez que você compra um artefato você gasta um determinado número de moedas.
        // Calcule a quantidade final de moedas.

        double moedas = 1500.00;

        double artefato1 = 50.00;
        double artefato2 = 30.00;
        double artefato3 = 70.00;
        double artefato4 = 20.00;

        System.out.println("Total de moedas: R$ " + moedas);

        moedas = moedas - artefato1;

        System.out.println("Total de moedas após compra do artefato 1: R$ " + moedas);

        moedas = moedas - artefato2;

        System.out.println("Total de moedas após compra do artefato 2: R$ " + moedas);

        moedas = moedas - artefato3;

        System.out.println("Total de moedas após compra do artefato 3: R$ " + moedas);

        moedas = moedas - artefato4;

        System.out.println("Total de moedas após compra do artefato 4: R$ " + moedas);

    }
}
