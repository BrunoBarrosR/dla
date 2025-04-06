package dia3;

import java.util.Scanner;

public class Desafio_02 {

    public static void main(String[] args) {
        //Com o que você já sabe, quero que você crie um código que determine se um número é impar ou par.
        //Dica: Para isso utilize exatamente o operador de módulo que explicamos agora.

        Scanner sc = new Scanner(System.in);

        System.out.println("Verificação Par ou Ímpar");

        System.out.print("Digite o número a ser verificado: ");
        int numero = sc.nextInt();

        int resultado = numero % 2;

        if (resultado == 0) {
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é ímpar!");
        }

        sc.close();
    }
}
