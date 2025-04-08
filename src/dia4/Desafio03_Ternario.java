package dia4;

public class Desafio03_Ternario {

    //Analise esse código. Temos 2 variáveis, uma que controla a nota de um aluno e outra que representa o
    //status de aprovação em uma disciplina. Caso a nota seja maior ou igual a 70, então o aluno estará
    //aprovado, caso contrário reprovado.
    //
    //Com o que já foi explica, converta essa forma de condicional e uma condição ternária. Bem simples, hein?

//    let nota = 85;
//    let status;
//
//    if (nota >= 70) {
//    status = "aprovado";
//    } else {
//    status = "reprovado";
//
//    console. log(status);

    public static void main(String[] args) {

        int nota = 69;

        String status = (nota >= 70) ? "Aprovado" : "Reprovado";

        System.out.println(status);


    }

}
