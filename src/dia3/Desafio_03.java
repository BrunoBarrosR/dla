package dia3;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_03 {

    public static void main(String[] args) {

        //Calcule o IMC de uma pessoa (que é peso dividido pela altura ao quadrado). Se o resultado ficar menor
        //que 18,5, mostre que está abaixo do peso; se for maior ou igual 18,5 e menor que 24,9, mostre que
        //está com peso normal; se for maior ou igual a 24,9 e menor que 29.9, mostre que está com sobrepeso,
        //senão mostre que é obesidade.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é igual a = %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso!");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Seu peso está normal.");
        } else if (imc >= 24.9 && imc < 29.9) {
            System.out.println("Você está com sobrepeso!!");
        } else {
            System.out.println("Seu imc está em nível de obesidade!!!");
        }

        sc.close();
    }
}
