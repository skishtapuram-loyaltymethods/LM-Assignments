package Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
//        hashSet.add(1);
        hashSet.add(10);
        hashSet.add(33);
        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(54);
        hashSet.add(6);


        Iterator iterator = hashSet.iterator();

////        hashSet.remove(1);
//        System.out.println(hashSet.contains(1));
//        System.out.println(hashSet.iterator().next());
//        System.out.println(h);

        while(hashSet.iterator().hasNext()){
            System.out.println(hashSet.iterator().next());

        }


    }
}
