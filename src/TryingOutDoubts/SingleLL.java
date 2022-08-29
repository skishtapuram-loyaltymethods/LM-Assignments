package TryingOutDoubts;

import java.util.LinkedList;

public class SingleLL {

    Node head;
    Node tail;
    static int size;

    public SingleLL() {
        SingleLL.size = 0;
    }

    private class Node {
        int val;
        Node next, prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    void insertFirst(int val) {

        Node node = new Node(val);
//        if (head != null) {
//
////            Node temp = head;
////            node.next = temp;
//        }
//
//        head = node;
//
////
//
//
//        if (tail == null) {
//            tail = node;
//        }
//        size++;
        if (head == null && tail == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
//            tail.next = head;

        }

    }


    public static void main(String[] args) {
        SingleLL singleLL = new SingleLL();
        singleLL.insertFirst(100);
        singleLL.insertFirst(200);


        Node temp = singleLL.head;
//        do{
//            System.out.println(temp.val);
//          temp = temp.next;
//        }while(temp!=singleLL.head);
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

        System.out.println("saddddddddddddd");



//        Node temp1 = singleLL.tail;
//        while (temp1 != null) {
//            System.out.println(temp1.val);
//            temp1 = temp1.prev;
//        }
//        Node temp = singleLL.head;
//        for (int i = 0; i < size; i++) {
//            System.out.println(temp.val);
//            temp = temp.next;
//
//
//        }


    }


}
