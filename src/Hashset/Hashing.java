package Hashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(50);
        hashSet.add(1);
//        hashSet.add(1);
        hashSet.add(10);
        hashSet.add(33);
        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(54);
        hashSet.add(6);
        System.out.println(hashSet  );


        Iterator<Integer> it = hashSet.iterator();


//        while (hashSet.iterator().hasNext()){
//            System.out.println(hashSet.iterator().next());
//        }

        while (it.hasNext()) {
//            System.out.println(hashSet.iterator().next());
            System.out.println(it.next());
        }

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("ford", new ArrayList<>());
        map.get("ford").add("GT");
        map.get("ford").add("Mustang Mach-E");
        map.get("ford").add("Painter");

//        map.remove("Name");
        System.out.println(map);


        HashMap<Integer,Integer> map1 = new HashMap<>();
        int i = 0 ;
        while(i<=10){
            map1.put(i, i* 2);
            i++;

        }
        System.out.println(map1);

    }


}
