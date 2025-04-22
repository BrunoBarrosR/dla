package semana2.dia13;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Deafio_CTD2 {


    static Deque<String> tarefas = new LinkedList<>();

    public static void main(String[] args) {

        entrarNaFila("tarefa01" );
        entrarNaFila("tarefa02" );
        entrarNaFila("tarefa03" );
        entrarNaFila("tarefa04" );

        System.out.println(tarefas);

        aumentarPrioridade("tarefa03");
        aumentarPrioridade("tarefa04");
        aumentarPrioridade("Tarefa");

        diminuirPrioridade("tarefa01");
        diminuirPrioridade("tarefa01");

        System.out.println(tarefas);


    }

    public static void entrarNaFila(String tarefa) {
        tarefas.add(tarefa);
//        tarefas.push(tarefa);
        System.out.println("Tarefa: " + tarefa + " foi adicionada!");
    }


    public static void aumentarPrioridade(String tarefaAlterada) {

        //transformar o deque tarefas em uma listaTarefas para utilzar indexOf
        List<String> listaTarefas = new LinkedList<>(tarefas);

        //Identificar o index da String passada
        int indexAtual = listaTarefas.indexOf(tarefaAlterada);

        //Verificar se o index identificado não é o primeiro (indexAtual > 0).
        // IFNão sendo, lógica: diminuir uma posição dentro da lista
        //ELSEIF (indexAtual == -1) - "Está tarefa não está na fila de produção"
        // ELSESe for não tem como aumentar a sua prioridade. Mensagem de "Este já é o item prioritário!"
        if(indexAtual > 0) {
            int indexPosterior = indexAtual - 1;

            Collections.swap(listaTarefas, indexAtual, indexPosterior);

            System.out.println("Prioridade da tarefa " + tarefaAlterada + " foi aumentada!");
            for (String tarefa : listaTarefas) {
                System.out.println(tarefa);
            }

            tarefas = new LinkedList<>(listaTarefas);

        } else if (indexAtual == -1) {
            System.out.println("Esta tarefa não está na fila de produção");
        } else {
            System.out.println("Esta já é a tarefa prioritária!");
        }
    }


    public static void diminuirPrioridade(String tarefaAlterada) {

        List<String> listaTarefas = new LinkedList<>(tarefas);

        int indexAtual = listaTarefas.indexOf(tarefaAlterada);

        if (indexAtual == -1) {
            System.out.println("Esta tarefa não está na fila de produção");
        } else if (indexAtual < listaTarefas.size() - 1) {
            // Pode diminuir prioridade
            int indexPosterior = indexAtual + 1;
            Collections.swap(listaTarefas, indexAtual, indexPosterior);
            System.out.println("Prioridade da tarefa " + tarefaAlterada + " foi diminuída!");
            for (String tarefa : listaTarefas) {
                System.out.println(tarefa);
            }
            tarefas = new LinkedList<>(listaTarefas);
        } else {
            System.out.println("Esta já é a última tarefa!");
        }
    }
}
