package dia6;

public class Desafio01_IMC {

    //Crie uma função que utiliza o peso e a altura como parâmetros para calcular o IMC de uma pessoa. Só
    //lembrando que o IMC é o peso divido pela altura ao quadro.

    public static void main(String[] args) {

        double altura = 1.77;
        double peso = 83.0;

        System.out.println(imc(altura, peso));
    }

    public static double imc(double altura, double peso) {
        return peso / (altura * altura);
    }

}
