package Stack;

import java.util.Arrays;

public class StackImplementation {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();

        customStack.push(90);

        System.out.println(Arrays.toString(customStack.data));

        System.out.println(customStack.pop());

        System.out.println(Arrays.toString(customStack.data));


    }
}
