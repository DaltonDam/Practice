package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Strelok");
        stack.push("Scar");
        stack.push("Duty");
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
