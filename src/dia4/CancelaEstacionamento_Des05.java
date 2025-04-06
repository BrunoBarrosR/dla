package dia4;

public class CancelaEstacionamento_Des05 {

    //Para testar sua habilidades, vamos direto para um desafio. Imagine que você está programando o sistema de controle de uma cancela de estacionamento.
    //Este sistema tem três possíveis estados: "Aberta", "Fechada" e "Manutenção".
    //Baseado no valor da variável estado, crie um código usando switch que imprima uma mensagem adequada para o motorista.

    public static void main(String[] args) {

        int condicao = 4;
        String estados = "";

        switch (condicao) {
            case 1:
                estados = "Aberta";
                break;

            case 2:
                estados = "Fechada";
                break;

            case 3:
                estados = "Manutenção";
                break;

            default:
                estados = "Estado inválido";
                break;
        }
        System.out.println(estados);
    }
}
