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
        double valorCompra = 0;
        double desconto = 0;

        System.out.println("Digite o tipo de produto (Alimentos, Eletrônicos, Roupas, Livros, outros): ");
        tipoProduto = sc.nextLine();

        System.out.println("Digite o valor da compra: ");
        valorCompra = sc.nextDouble();


        switch (tipoProduto) {
            case "Alimentos":
                desconto = 5;
                break;
            case "Eletrônicos":
                desconto = 10;
                break;
            case "Roupas":
                desconto = 20;
                break;
            case "Livros":
                desconto = 50;
                break;
            default:
                desconto = 0;
                break;
        }

        valorCompra = valorCompra * (1 - desconto / 100);
        System.out.println("Desconto de " + desconto + "% aplicado! Valor final: R$ " + valorCompra + "." );
        sc.close();
    }
}
