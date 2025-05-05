package semana3.dia15;

public class ListaEncadeada {
    Node head;

    public void insertFirst(String element) {
        final Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertLast(String element) {
        final Node newNode = new Node(element);

        if(head == null) {
            head = newNode;
        } else {
            Node atual = head;
            while(atual.next != null) {
                atual = atual.next;
            }
            atual.next = newNode;
        }

    }

    public void insertAt(String element, int position) {
        final Node newNode = new Node(element);

        if (position == 0) {
            //Se for para inserir na posição Zero, ou seja, primeira posição. Vou passar o ponteiro do head atual para o newNode.next. Depois passo o newNode para head
            newNode.next = head;
            head = newNode;
            return;
        }

        Node atual = head;
        Node anterior = null;
        int contador = 0;

        while(contador < position && atual != null) {
            anterior = atual;
            atual = atual.next;
            contador++;
        }

        if (contador == position) {
            anterior.next = newNode;
            newNode.next = atual;

        } else {
            System.out.println("Posição inválida!");
        }
    }

//    public void deleteAt(String element) {
//
//    }
//
//    public void searchAt(String element) {
//
//    }
//
//    public void traversal() {
//
//    }
//
//    public void indexOf() {
//
//    }


    public void print() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.element + " -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }

}
