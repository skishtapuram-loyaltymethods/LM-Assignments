package Stack;

import java.util.Deque;
import java.util.Queue;

class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int pointer = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }


    public int push(int value) {

        if (pointer == data.length - 1) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        pointer++;
        data[pointer] = value;
        return value;
    }


    public int pop() {
        int value = data[pointer];
        data[pointer] = 0;
        pointer--;
        return value;
    }

    //    public int pop(){
//         return data[pointer--];
//    }
    public int peek() {
        return data[pointer];
    }




//    Queue<Integer> queue = new
}
