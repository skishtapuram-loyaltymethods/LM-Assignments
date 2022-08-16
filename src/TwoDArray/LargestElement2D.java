package TwoDArray;

public class LargestElement2D {


    public static int largestEle(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= max) max = arr[i][j];

            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{15, 30, 20, 19},
                {101, 202, 45, 60},
                {75, 101, 500, 34},
                {35, 28, 19, 0}};


        System.out.println(largestEle(arr));


    }
}
