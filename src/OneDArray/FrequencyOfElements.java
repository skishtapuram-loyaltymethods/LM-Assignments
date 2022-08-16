package OneDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyOfElements {

    public static List distinctEle(int[] arr) {

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) count++;

            }
//            System.out.println(arr[i] + " -->> " +count );
            if (count == 1) list.add(arr[i]);

        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(distinctEle(new int[]{1, 1, 1, 2, 2, 2, 2, 3, 4, 5, 1, 1, 5, 2, 7}));
    }

//    public static List<String> freqArr(int[] arr){
//        ArrayList<String> arrayList = new ArrayList<>();
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        for (int i = arr.length-1; i > 0; i--) {
//
////            int temp = arr[i];
//            if(arr[i] != arr[i-1]) {
//                int count = 0;
//
//
//                for (int j = arr.length-1; j > 0; j--) {
//                    if (arr[i] == arr[j]) count++;
//                }
//                arrayList.add(arr[i]+" -> " + count + " Times");
//
//            }
//
//        }
//        return arrayList;
//
//    }
}
