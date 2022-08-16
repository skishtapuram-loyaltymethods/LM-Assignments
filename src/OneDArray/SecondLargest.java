package OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

      findSecMax();


    }
    public static void findSecMax(){
        int[] arr = {0,0,0,0,0,0};
        int temp = Integer.MIN_VALUE;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== arr.length-1) {
                if(arr[i-1]==arr[i]) count++;
            }
            if(arr[i]==arr[i]) count++;

        }



        if(count != arr.length) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[i]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }


            int max = arr[0];
            int secMax = Integer.MIN_VALUE;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    secMax = max;
                    max = arr[i];
                }
            }


            if (secMax == 0) System.out.println("Cant Find Second Largest Number");
            else System.out.println(secMax);
        }
        else System.out.println("Cant Find Second Largest Number");



    }



//    public void findSecMax(){
//        int[] arr = {0, 0, 1};
//        int max = arr[0];
//        int secMax = Integer.MIN_VALUE;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                secMax = max;
//                max = arr[i];
//            }
//        }
//        if (secMax == 0) System.out.println("Cant Find Second Largest Number");
//        else System.out.println(secMax);
//    }



//    {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        Integer[] arr = new Integer[3];
//        while(T>0){
//            for(int i=0;i<3;i++) {
//                arr[i] = sc.nextInt();
//            }
//            Arrays.sort(arr);
//            System.out.println(arr[1]);
//            T--;
//        }
//    }
}
