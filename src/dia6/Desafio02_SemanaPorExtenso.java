package dia6;

public class Desafio02_SemanaPorExtenso {

    //Vamos agora transformar aquele código que criamos no dia 4, sobre os dias de semana utilizando switch
    //em uma função chamada obterDiaDaSemana, onde receberemos um número que representa o dia da semana que vai de 1 a 7 e ele retornará esse dia por extenso.
    //
    //A ideia é que a lógica fique dentro de uma função.
    //Faça várias chamadas da função para ver o resultado.

    public static void main(String[] args) {

        int diaDaSemana = 8;

        System.out.println(obterDiaDaSemana(diaDaSemana));
    }

    public static String obterDiaDaSemana(int diaDaSemana) {

        return switch (diaDaSemana) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Dia inválido";
        };
    }
}
