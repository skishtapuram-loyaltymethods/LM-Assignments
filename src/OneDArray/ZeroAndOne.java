package OneDArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ZeroAndOne {
    public static void main(String[] args) {
//        Time Comple
        int[] arr = {0,1,0,0,1,0,1};
        int[] arr1 = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                arr1[i] = 0;
                count++;
            }

        }
        for (int i = count; i < arr.length; i++) {
            arr1[i] = 1;
        }
        System.out.println(Arrays.toString(arr1));



















//        int[] arr = {0, 1, 1, 0, 0, 1, 0,
//                1, 0, 0, 1, 1, 1, 0,
//                0, 1, 0};
//        int p1 = 0;
//        int p2 = 0;
//        while(p2 < arr.length && p1 < arr.length){
//            if(arr[p1] == 0 && arr[p2] == 1){
//                int temp = arr[p1];
//                arr[p1] = arr[p2];
//                arr[p2] = temp;
//                p2++;
//            }
//            if(arr[p1] != 0){
//                p1++;
//            }
//            else{
//                p2++;
//            }
//        }




//        System.out.println(Arrays.toString(arr));




    }
}
