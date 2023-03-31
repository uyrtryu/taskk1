import org.w3c.dom.ls.LSOutput;

public class List {
    private Node head;
    private Node tail;

    public List() {
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void pushEnd(int data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            head = temp;
        } else {
            tail.setNext(temp);
            temp.setPrev(tail);
        }
        tail = temp;
    }

    public void pushFirst(int data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            tail = temp;
        } else {

            head.setPrev(temp);
            temp.setNext(head);

        }
        head = temp;
    }    //очередь

    public int peekQueue() {
        return head.getData();
    }

    public int popQueue() {
        int k = head.getData();
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrev(null);
            head = head.getNext();
        }
        return k;
    }


    public void printQueue() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData());
            System.out.print(" -> ");
            temp = temp.getNext();
        }
    }

    //стек
    public int popStack() {
        int k = tail.getData();
        if (head.getNext() == null) {
            tail = null;
        } else {
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
        }return k;
    }
    public void printStek() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.getData());
            System.out.print(" -> ");
            temp = temp.getPrev();
        }
    }

    public int peekStack() {
        return tail.getData();
    }



}