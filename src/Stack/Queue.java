package Stack;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        String name = "Gautham";
        char[] cha = name.toCharArray();
        for(char cha1 : cha){
            System.out.println(cha1);
        }


        java.util.Queue queue = new LinkedList();
        for (int i = name.length()-1; i >= 0; i--) {
            queue.add(name.charAt(i));
            System.out.println();queue.poll();
        }



//        System.out.println(queue.add(22));

//            System.out.println(queue.isEmpty());
//        System.out.println(queue.size());


    }
}