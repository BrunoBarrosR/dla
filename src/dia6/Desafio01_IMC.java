package dia6;

public class Desafio01_IMC {

    //Crie uma função que utiliza o peso e a altura como parâmetros para calcular o IMC de uma pessoa. Só
    //lembrando que o IMC é o peso divido pela altura ao quadro.

    public static void main(String[] args) {

        double meuImc = imc(1.77, 83);
        double imcAlline = imc(1.59, 51);

        System.out.println(meuImc);
        System.out.println(imcAlline);
    }

    public static double imc(double altura, double peso) {
        return peso / (altura * altura);
    }

}
