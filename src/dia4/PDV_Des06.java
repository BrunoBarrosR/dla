package dia4;

public class PDV_Des06 {

    //Suponha que você está programando um sistema PDV e precisa calcular o desconto aplicado a um produto.

    //O desconto é dado com base no tipo do produto:
    //"Alimentos" têm um desconto de 5%, "Eletrônicos" têm um desconto de 10%, "Roupas" têm um desconto de 20% e "Livros" têm um desconto de 50%.
    //Se o tipo do produto não estiver na lista, não há desconto. Crie um código usando switch que calcule e imprima o valor final do produto após a
    //aplicação do desconto, com base no tipo do produto.

    public static void main(String[] args) {

        int tipoProduto = 6;


        switch (tipoProduto) {
            case 1:
                System.out.println("Alimentos - Desconto de 5% aplicado");
                break;
            case 2:
                System.out.println("Eletrônicos - Desconto de 10% aplicado");
                break;
            case 3:
                System.out.println("Roupas - Desconto de 20% aplicado");
                break;
            case 4:
                System.out.println("Livros - Desconto de 50% aplicado");
                break;
            default:
                System.out.println("Não há desconto a ser aplicado!");
                break;
        }

    }
}
