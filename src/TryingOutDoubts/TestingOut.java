package TryingOutDoubts;

import java.util.Arrays;

public class TestingOut {
    static int a = 10;
    static int b = 20;

    public static void main(String[] args) {

//        System.out.println(swap(a, b));
        System.out.println(a + " " + b);
        change(100);
        System.out.println(a + " " + b);
    }


    static String swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        return a + " " + b;

    }

    static void change(int h) {
        a = h;
    }

    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }
}
