package semana3.dia15;

public class ListaEncadeada {
    Node head;

    public void insertFirst(String element) {
        final Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(String element) {
        final Node newNode = new Node(element);

        if(head == null) {
            head = newNode;
            return;
        }

        Node atual = head;
        while(atual.next != null) {
            atual = atual.next;
        }
        atual.next = newNode;

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
        int index = 0;

        while(index < position && atual != null) {
            anterior = atual;
            atual = atual.next;
            index++;
        }

        if (index == position) {
            anterior.next = newNode;
            newNode.next = atual;

        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void deleteAt(int position) {

        if (head == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node atual = head;
        Node anterior = null;
        int index = 0;

        while(index < position && atual != null) {
            anterior = atual;
            atual = atual.next;
            index++;
        }

        if (index == position) {
            anterior.next = atual.next;

        } else {
            System.out.println("Essa posição não existe!");
        }
    }


//    public void searchAt(String element) {
//
//    }
//
//    public void traversal() {
//
//    }
//
    public void indexOf(String element) {
        if (head == null) {
            System.out.println("Lista vazia!");
            return;
        }

        Node anterior = null;
        Node atual = head;
        int index = 0;

        while (atual != null) {

            if(atual.element.equals(element)){
                System.out.println(index);
                return;
            }

            anterior = atual;
            atual = atual.next;
            index++;
        }
        System.out.println("Elemento não encontrado: " + element);
    }


    public void print() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.element + " -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }

}
