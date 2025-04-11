package semana1.dia5;

public class Desafio01_AplicacaoFinanceira {

    //Rendimento de aplicação financeira
    //
    //Suponha que você investiu R$ 1.000 em uma aplicação financeira que rende 12% ao ano. Usando um loop for,
    //podemos calcular como esse investimento cresce ao longo do tempo, vamos supor nos próximos 10 anos.
    //Mostre o valor no console por ano.

    public static void main(String[] args) {

        double investimento = 1000.00;
        //rendimento em porcentagem (%)
        int taxaJuros = 12;
        int anosInvestimento = 10;

        for (int i = 1; i <= anosInvestimento; i++) {
            investimento = investimento + (investimento * taxaJuros / 100);
            System.out.printf("Seu investimento em %d ano(s) é igual a: R$ %.2f%n", i, investimento );
        }

    }

}
