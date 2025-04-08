package dia4;

public class Desafio04_Ternario2 {

    //Condição ternária com expressão mais complexa
    //
    //Um cliente possui uma conta em uma loja com um certo saldo para compras e uma condição que indica
    //se a conta está ativa ou não. Sua tarefa é escrever um código que determine se o cliente pode fazer compras com sua conta.
    //
    //As condições para poder comprar são: a conta precisa estar ativa (ou seja, o cliente não deve estar
    //inativo) e o saldo deve ser maior que 500. Use a condição ternária para isso.

    public static void main(String[] args) {

        boolean contaAtiva = true;
        double saldo = 500.0;

        String compraOk = (contaAtiva && saldo >= 500.0) ? "Cliente pode comprar!" : "Cliente não pode comprar!";

        System.out.println(compraOk);
    }
}
