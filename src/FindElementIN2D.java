public class FindElementIN2D {
//    Regular Logic
    public static boolean findElement(int[][] arr, int val){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == val) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] arr = {{10,20 ,30 ,40},
                      {15,25,35,45},
                      {27,29,37,48},
                      {32,33,39,50}};

        System.out.println(findElement1(arr,39));

    }

    public static boolean findElement1(int[][] arr, int val){
        for (int i = 0; i < arr.length ; i++) {
            if(-1 == search(arr[i], val)) return false;
//                for (int j = 0; j < arr[i].length; j++) {
//                    if (arr[i][j] == val) {
//                        return true;
//                    }
//                }
//            }
        }
        return true;
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;

        while (start <= end){

            int mid = (start + end)/2;

            if (nums[mid] < target ) end = mid - 1 ;

            else if(nums[mid] > target) start = mid + 1 ;

            else return mid;

        }
        return -1;
    }
}
