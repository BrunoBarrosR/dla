package dia4;

import java.util.Locale;
import java.util.Scanner;

public class Performance_Des02 {
    //Crie um algoritmo que precisa dizer para um aluno como foi sua performance em uma prova a partir da nota que ele tirou.

    //As regras são:
    //1. Se a nota for menor que 5, então mostre que foi "Insuficiente";
    //2. Se foi menor que 6, então mostre "Regular";
    //3. Se foi menor que 7.5, mostre "Bom"
    //4. Se foi menor que 9, "Muito bom";
    //5. E finalmente se for maior ou igual a 9, mostre "Excelente".

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 10): ");
        double nota = sc.nextDouble();

        if (nota >= 0 && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota >= 0 && nota < 6) {
            System.out.println("Regular");
        } else if (nota >= 0 && nota < 7.5) {
            System.out.println("Bom");
        } else if (nota >= 0 && nota < 9) {
            System.out.println("Muito bom");
        } else if (nota >= 0 && nota <= 10) {
            System.out.println("Excelente");
        } else {
            System.out.println("Nota inválida");
        }
        sc.close();
    }
}
