package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] ans = mergeSort(new int[]{9, 23, 5, 0, 3, 6});
//        int[] asn2 = {3,5};
//        int[] ans3 = {1,2,4};
//        int[] ans1 = merge(asn2,ans3);
//        System.out.println(Arrays.toString(ans1));

        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

//
//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));

        return merge(left, right);
    }


    static int[] merge(int[] left, int[] right) {
        int[] total = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                total[k] = left[i];
                i++;
            } else {
                total[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            total[k] = left[i];
            i++;
            k++;

        }

        while (j < right.length) {
            total[k] = right[j];
            j++;
            k++;

        }
        return total;
    }

}
