package semana1.dia4;

public class Desafio05_CancelaEstacionamento {

    //Para testar sua habilidades, vamos direto para um desafio. Imagine que você está programando o sistema de controle de uma cancela de estacionamento.
    //Este sistema tem três possíveis estados: "Aberta", "Fechada" e "Manutenção".
    //Baseado no valor da variável estado, crie um código usando switch que imprima uma mensagem adequada para o motorista.

    public static void main(String[] args) {

        String estado = "Manutenção";

        switch (estado) {
            case "Aberta":
                System.out.println("Cancela está aberta! Acesso liberado");;
                break;

            case "Fechada":
                System.out.println("Cancela está fechada! Acesso bloqueado");
                break;

            case "Manutenção":
                System.out.println("Cancela está em manutenção! Acesso bloqueado, use a outra entrada!!");
                break;
            default:
                System.out.println("Estado desconhecido!");
                break;
        }
    }
}
