package semana1.dia3;

import java.util.Locale;
import java.util.Scanner;

public class Multiplicacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //1. Vamos supor que você tenha 2 produtos e que queira comprar 2 unidades de cada. Faça a multiplicação para encontrar o total.

        double produto1 = 150.00;
        double produto2 = 350.00;

        double total = (produto1 * 2) + (produto2 * 2);

        System.out.println("O total da compra ficou em R$ " + total);

        double precoProduto = 10;
        double quantidadeProduto = 2;
        double totalCompras = precoProduto * quantidadeProduto;

        System.out.println(totalCompras);

        //2. Calcule a área de um retângulo.


        System.out.print("Digite o valor da comprimento: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite o valor da largura: ");
        double largura = sc.nextDouble();

        double area = comprimento * largura;

        System.out.println("A área do retangulo é igual a: " + area);


        //3. Crie 2 variáveis que contêm o total de horas trabalhadas e o valor por hora. Calcule o total a receber depois de trabalhar 160 horas.

        int horasTrabalhadas = 160;
        System.out.println("Total de horas trabalhadas: " + horasTrabalhadas + "h");
        System.out.print("Digite o valor por hora: ");
        double valorPorHora = sc.nextDouble();

        double totalAReceber = horasTrabalhadas * valorPorHora;

        System.out.println("O total a receber é igual a: R$ " + totalAReceber);

        sc.close();
    }
}
