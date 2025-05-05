package semana3.dia15;

public class NodeMain {

    public static void main(String[] args) {
        ListaEncadeada lista1 = new ListaEncadeada();
        ListaEncadeada lista2 = new ListaEncadeada();

        lista1.insertFirst("10");
        lista1.insertFirst("20");
        lista1.insertFirst("30");

        lista2.insertLast("10");
        lista2.insertLast("20");
        lista2.insertLast("30");
        lista2.insertLast("40");
        lista2.insertLast("50");

        lista1.insertAt("69", 1);
        lista1.insertAt("999", 3);


        lista1.print();
        lista2.print();


    }
}
