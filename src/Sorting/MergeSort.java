package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
      mergeSort(new int[]{1,2,3,4,5});
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1 ) return arr;

        int mid =  arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));


        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

return arr;
    }
}
