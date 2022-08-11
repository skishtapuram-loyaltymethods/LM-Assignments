package Arrays;

import java.util.Arrays;

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
    public void addItemAt(int index,int value) throws Exception{
        if(index<= SIZE) {
            for (int i = pointer; i >= index; i++) {
                Array[i + 1] = Array[i];
            }
            Array[index] = value;
            pointer++;
        }
        else {
            throw IndexOutOfBoundsException;
        }

    }


    public void removeItem() {
        Array[pointer] = 0;
        pointer--;
    }

    public void removeItemAt(int index) throws Exception {

        if(index<=pointer) {
            if (index <= pointer && index > -1) {
                Array[index] = 0;
            } else if (Array[index] == 0) {
                throw IndexOutOfBoundsException;
            }
            pointer--;
        }
        else System.out.println("Unable to remove the Item");
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
        dynamicArray.addItemAt(2,99);
        dynamicArray.addItem(12);

        System.out.println(Arrays.toString(dynamicArray.Array));
    }
}
