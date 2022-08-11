import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class DynamicArray {
    int[] Array;
    private int SIZE = 10;
    int pointer = -1;
    private Exception IndexOutOfBoundsException;

    public DynamicArray() {
        this.Array = new int[SIZE];
    }


    public void addItem(int value) {
        if (pointer == Array.length - 1) {
            SIZE *= 2;
            int[] temp = new int[SIZE];

            for (int i = 0; i < Array.length; i++) {
                temp[i] = Array[i];
            }
            Array = temp;
        }

//        pointer++;
        Array[++pointer] = value;

    }
//    public void insertAt(int index,int value){
////        if (Array[index]!=0){
////            for(int i = )
////        }
////
//
//
//
//    }


    public void removeItem() {
        Array[pointer] = 0;
        pointer--;
    }

    public void removeItemAt(int index) throws Exception {
        if (index <= pointer && index > -1) {
            Array[index] = 0;
        } else if (Array[index] == 0) {
            throw IndexOutOfBoundsException;
        }

    }

    public int getSize() {
        return pointer;
    }


    public int getCapacity(){
        return SIZE;
    }




    public static void main(String[] args) throws Exception {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.size();
//        arrayList.

//        System.out.println(arrayList);

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addItem(12);
        dynamicArray.addItem(12);
        System.out.println(Arrays.toString(dynamicArray.Array));
        dynamicArray.removeItemAt(1);
        System.out.println(Arrays.toString(dynamicArray.Array));
    }
}
