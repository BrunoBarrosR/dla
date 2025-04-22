package semana2.dia12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Desafio_FilaDriveThrough {

    static Queue<String[]> filaPedidos = new LinkedList<>();

    public static void main(String[] args) {

        realizarPedidoTotem("BXE4R43","X Bacon");
        realizarPedidoTotem("PXA3R12","X Egg");
        realizarPedidoTotem("PQW1T49","X Egg-Bacon");
        statusPedido();
        atenderCarro();
        atenderCarro();
        realizarPedidoTotem("QER1Y67","X Salada");
        statusPedido();
        atenderCarro();
        statusPedido();
        atenderCarro();
        statusPedido();

    }

    static void realizarPedidoTotem(String placaCarro, String pedido) {
        filaPedidos.add(new String[] {placaCarro, pedido});
        System.out.println("O carro com a placa: " + placaCarro + " solicitou o " + pedido + " como pedido e foi adicionado a fila de produção!");


    }

    static void atenderCarro() {
        if(filaPedidos.isEmpty()) {
            System.out.println("Não há carros na fila!");
            return;
        }

        String[] pedidoPronto = filaPedidos.poll();
        System.out.println("Placa: "+ pedidoPronto[0]+ " seu pedido: "+ pedidoPronto[1] + " está pronto para retirada!");

    }

    static void statusPedido() {
        if(filaPedidos.isEmpty()){
            System.out.println("Não há pedidos na fila!");
            return;
        }

        System.out.println("Restam " + filaPedidos.size() + " pedidos na fila!");
        System.out.println("Fila de pedidos: ");
        for (String[] pedido : filaPedidos) {
            System.out.println("[Placa: " + pedido[0] + " => Pedido: " + pedido[1] + "]");
        }
        System.out.println();
    }


}
