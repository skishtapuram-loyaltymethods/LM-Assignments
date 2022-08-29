package LinkedList;

public class DoubleLinkedList {

    Node head;
    Node tail;

    class Node {
        Node prev;
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        String haha = "";
        Node temp = head;
        while (temp.next != null) {
//            System.out.println(temp.value);
            haha = haha + temp.value + "  ";
            temp = temp.next;
        }
        // System.out.println(haha + " nnn");
        return haha;
    }

    public void insertFirst(int val) {
        if (head == null && tail == null) {
            Node node = new Node(val);
            head = node;
            tail = node;
        } else {

            Node node = new Node(val);
//            Node temp = head;
            head.prev = node;
            node.next = head;
            head = node;


        }

    }


    public void insertAt(int val, int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {

            temp = temp.next;
        }

        Node node = new Node(val);


        temp.prev.next = node;
        node.prev = temp.prev;

        node.next = temp;
        temp.prev = node;


    }


    public void remove(int val) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == val) {
                break;
            }
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }


}
