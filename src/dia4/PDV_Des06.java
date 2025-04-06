package dia4;

import java.util.Locale;
import java.util.Scanner;

public class PDV_Des06 {

    //Suponha que você está programando um sistema PDV e precisa calcular o desconto aplicado a um produto.

    //O desconto é dado com base no tipo do produto:
    //"Alimentos" têm um desconto de 5%, "Eletrônicos" têm um desconto de 10%, "Roupas" têm um desconto de 20% e "Livros" têm um desconto de 50%.
    //Se o tipo do produto não estiver na lista, não há desconto. Crie um código usando switch que calcule e imprima o valor final do produto após a
    //aplicação do desconto, com base no tipo do produto.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String tipoProduto = "";
        double valorCompra;

        System.out.println("Digite o tipo de produto (Alimentos, Eletrônicos, Roupas, Livros, outros): ");
        tipoProduto = sc.nextLine();

        System.out.println("Digite o valor da compra: ");
        valorCompra = sc.nextDouble();

        switch (tipoProduto) {
            case "Alimentos":
                valorCompra = valorCompra * 0.95;
                System.out.println("Desconto de 5% aplicado! Valor final: " + valorCompra);
                break;
            case "Eletrônicos":
                valorCompra = valorCompra * 0.90;
                System.out.println("Desconto de 10% aplicado! Valor final: " + valorCompra);
                break;
            case "Roupas":
                valorCompra = valorCompra * 0.80;
                System.out.println("Desconto de 20% aplicado! Valor final :" + valorCompra);
                break;
            case "Livros":
                valorCompra = valorCompra * 0.50;
                System.out.println("Desconto de 50% aplicado! Valor final: " + valorCompra);
                break;
            default:
                System.out.println("Não há desconto a ser aplicado! Valor final: " + valorCompra);
                break;
        }
        sc.close();
    }
}
