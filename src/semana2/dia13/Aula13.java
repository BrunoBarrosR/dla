package semana2.dia13;

import java.util.ArrayDeque;
import java.util.Deque;

public class Aula13 {

    static Deque<String> itens = new ArrayDeque<>();

    public static void main(String[] args) {

        System.out.println("Está vazio: " + estaVazio());

        inserirInicio("Ferrari");
        inserirInicio("Fusca");
        inserirFim("HB20S");
        inserirFim("Meriva");

        consoleTable(obterItens());
        System.out.println("Está vazio: " + estaVazio());

        removerInicio();
        removerFim();

        consoleTable(obterItens());

        System.out.println( "Primeiro: " + primeiro() );
        System.out.println( "Último: " + ultimo() );



    }

    public static void inserirInicio(String item) {
        itens.addFirst(item);
    }

    public static void inserirFim(String item) {
        itens.addLast(item);
    }

    public static void removerInicio() {
        itens.removeFirst();
    }

    public static void removerFim() {
        itens.removeLast();
    }

    public static String primeiro() {
       return itens.peekFirst();
    }

    public static String ultimo() {
        return itens.peekLast();
    }

    public static boolean estaVazio() {
        return itens.isEmpty();
    }

    public static Deque<String> obterItens() {
        return itens;
    }


    public static void consoleTable(Deque<String> deque) {
        System.out.println("+-----------------+");
        System.out.println("|      Itens      |");
        System.out.println("+-----------------+");
        for (String item : deque) {
            System.out.println("| " + item);
        }
        System.out.println("+-----------------+");
    }

}
