package semana2.dia12;

import java.util.LinkedList;
import java.util.Queue;

public class Aula12 {

    static Queue<String> fila = new LinkedList<>();

    public static void main(String[] args) {

        // Simulação de chamadas recebidas
        receberChamada("123456789");
        receberChamada("987654321");
        receberChamada("555555555");

        // Atendendo uma chamada
        atenderChamada();

        // Verificando o status da fila
        statusFila();

        // Atendendo mais chamadas
        atenderChamada();
        atenderChamada();

    }

    static void receberChamada(String numeroCliente) {
        fila.add(numeroCliente);
        System.out.println(numeroCliente + " foi adicionado a fila!");
    }

    static void atenderChamada() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia!");
            return;
        }

        String chamadaAtendida = fila.poll();
        System.out.println(chamadaAtendida + " está em atendimento no momento.");
    }

    static void statusFila() {
        System.out.println("Total de chamadas na fila: " + fila.size());
        System.out.println("Chamadas em espera : " + fila);
    }


}
