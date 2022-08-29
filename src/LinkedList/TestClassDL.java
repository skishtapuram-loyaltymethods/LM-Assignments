package LinkedList;

import LinkedList.DoubleLinkedList;

public class TestClassDL {
    public static void main(String[] args) {
        DoubleLinkedList DL = new DoubleLinkedList();
        DL.insertFirst(200);
        DL.insertFirst(100);
        DL.insertFirst(300);
        DL.insertFirst(200);
        DL.insertFirst(100);
//        System.out.println(DL.head.value);
        DL.insertAt(2200,2);
        DL.remove(2200);
        System.out.println(DL);
    }
}
