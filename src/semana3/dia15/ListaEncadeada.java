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

    public void inserLast(String element) {
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
//
//    public void insertAt(String element) {
//
//    }
//
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
