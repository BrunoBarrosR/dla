package dia3;

public class Desafio01_Imc {
    public static void main(String[] args) {
        int peso = 83;
        double altura = 1.77;
        double imc = peso / Math.pow(altura, 2);;


        System.out.println("O IMC é igual a: " + imc);
    }
}