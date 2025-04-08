package dia5;

public class Desafio04_CompraParcelada {

    //Suponha que você comprou um produto e optou por parcelar o valor em 12 vezes sem juros.
    // Escreva um código que imprima o valor de cada parcela e o valor restante a ser pago.

    public static void main(String[] args) {

        double valorProduto = 2567.00;
        double valorParcela;
        double valorRestante = valorProduto;
        int parcelas = 12;

        valorParcela = valorProduto / parcelas;

        while (parcelas > 0) {

            valorRestante = valorRestante - valorParcela;

            System.out.printf("O valor da %dª parcela é de %.2f e o valor restante a pagar é igual a %.2f%n", parcelas, valorParcela, valorRestante);

            parcelas = parcelas - 1;
        }


    }

}
