package TwoDArray;

import static java.lang.Integer.MIN_VALUE;


public class LargestEle {
    public static void main(String[] args) {
       int[][] arr =
               {
                       {10,20, 30,40},
                       {15, 25 ,35 ,45},
                       {27 ,29 ,37, 48},
                       {32 ,33 ,39 ,50}
              };
//       int[] arr1 = {1,2,3,4,5,6,2,8,25,42};

       secondMax();

//        System.out.println(val);

    }







//    static int secondMax(int[] arr){
//        int max = 0;
//        int secMax = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > max ) {
//                max = arr[i];
//                secMax = max;
//            }
//        }
//
//
//
//
//        return secMax;
//    }







     static void secondMax(){
        int[] arr = {9,10,11,12,24};
        int large;
        int second_large = 0;
        large = arr[0];
        int index = 1;
        while(index < arr.length){
            if(arr[index] < large){
                second_large = arr[index];
                break;
            }
            index++;
        }
        if( second_large != 0){
            for(int i = 1; i < arr.length; i++){
                if(arr[i] > large){
                    second_large = large;
                    large = arr[i];
                }
                else if(arr[i] >  second_large && arr[i] != large){
                    second_large = arr[i];
                }
            }
        }
//
//        else{
//            System.out.println("we can't get second largest");
//        }
        if(second_large==0)
             System.out.println("we can't get second largest");
        else System.out.println(second_large);
    }



    public void findSecMax(){
        int[] arr = {0, 0, 1};
        int max = arr[0];
        int secMax =MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
        }
        if (secMax == 0) System.out.println("Cant Find Second Largest Number");
        else System.out.println(secMax);
    }

    




}