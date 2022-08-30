package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {134, 12, 14, 16, 52, 48, 100};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void selectionSort(int[] arr) {
//        int i = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
//
            }
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[maxIndex];
            arr[maxIndex] = temp;


        }


    }
}
