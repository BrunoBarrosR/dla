package dia5;

public class Desafio03_CalculoJuros {

    //Vamos calcular quanto tempo (em anos) levará para que um investimento inicial dobre, considerando uma
    //taxa de juros de 5% ao ano. Use um loop while para realizar os cálculos.

    public static void main(String[] args) {

        int anos = 0;
        double investimementoInicial = 1000.00;
        double investimemento = investimementoInicial;
        double taxaJuros = 5.0;


        while (investimemento < (investimementoInicial * 2)) {
            investimemento = investimemento + (investimemento * taxaJuros / 100);

            anos = anos + 1;
            System.out.printf("Em %d ano(s) você terá: R$ %.2f%n", anos, investimemento);
        }
        System.out.println("Ou seja, terá o valor inicial do investimento dobrado!");


    }

}
