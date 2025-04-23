package semana2.dia14;

import java.util.*;

public class Desafio_VariosCaixaMercado {
    //Lembra que no dia 8 você resolveu um problema envolvendo o controle de uma fila de caixa de supermercados? Vamos voltar nesse desafio, mas
    //agora para controlar várias filas ao mesmo tempo, ou seja, teremos a simulação real de um supermercado com vários caixas.
    //As funções deverão ser adaptadas para essa nova realidade. Imagine, um supermercado com 10 caixas, e consequentemente, 10 filas.
    //Ao invés de JSON irei utilizar um combinado de LinkedHashMap e Queue (LinkedList)

    static Map<String, Queue<String>> filasCaixas  = new LinkedHashMap<>();


    public static void main(String[] args) {

        //abrir caixas
        for(int i = 1; i <= 10; i++) {
            filasCaixas.put("Caixa_" + i, new LinkedList<>());
        }

        entrarNaFila("Caixa_1", "Bruno" );
        entrarNaFila("Caixa_2", "Alline" );
        entrarNaFila("Caixa_5", "Miguel");
        entrarNaFila("Caixa_6", "Tereza");
        entrarNaFila("Caixa_9", "Queta");
        entrarNaFila("Caixa_10", "Márcio");
        entrarNaFila("Caixa_8", "Maurício");
        entrarNaFila("Caixa_3", "Vitor");
        entrarNaFila("Caixa_4", "Carol");
        entrarNaFila("Caixa_3", "Ana P");
        entrarNaFila("Caixa_7", "Kevin");
        entrarNaFila("Caixa_7", "Gustavo");
        entrarNaFila("Caixa_", "Gustavo");

        statusCaixasFilas();

        atenderCliente("Caixa_1");
        atenderCliente("Caixa_2");
        atenderCliente("Caixa_3");
        statusCaixasFilas();

        atenderCliente("Caixa_4");
        atenderCliente("Caixa_5");
        statusCaixasFilas();

        atenderCliente("Caixa_6");
        atenderCliente("Caixa_7");
        atenderCliente("Caixa_8");

        statusCaixasFilas();

        atenderCliente("Caixa_9");
        atenderCliente("Caixa_10");

        statusCaixasFilas();


        atenderCliente("Caixa_10");
        atenderCliente("Caixa_");

        statusCaixasFilas();

    }



    static void entrarNaFila(String caixa, String cliente) {

        //criar a fila do caixa
        Queue<String> fila = filasCaixas.get(caixa);

        if(fila != null) {
            fila.add(cliente);
            System.out.println("O cliente " + cliente + " entrou na fila do " + caixa);
        } else {
            System.out.println("O " + caixa + " não existe!");
        }

    }

    static void atenderCliente(String caixa) {
        Queue<String> fila = filasCaixas.get(caixa);

        if(fila == null ) {
            System.out.println(caixa + " não existe!");
        } else if (fila.isEmpty()) {
            System.out.println("Fila do " + caixa +" está vazia!");
        } else {
            String clienteAtendido = fila.poll();
            System.out.println("Cliente " + clienteAtendido + " foi atendido(a)!");
        }

    }


    static void statusCaixasFilas() {
        System.out.println();
        System.out.println("No momento os caixas possuem as seguintes filas:");
        System.out.println(filasCaixas);
        System.out.println();
    }



}
