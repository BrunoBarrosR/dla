package dia3;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //1. Calcule a média de quatro notas.


        System.out.print("Digite a primeira nota:");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota:");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota:");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a quarta nota:");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media das notas é igual a: " + media);


        //2. Converta a distância de metros para quilômetros.

        System.out.println("Digite a distância em metros para a conversão em Km: ");
        double metros = sc.nextDouble();

        double km = metros / 1000.0;

        System.out.println("A distancia em Km é igual a: " + km);

        sc.close();
    }
}
