package StackAndQueue;

import java.util.Stack;
public class sTaCk {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(50);
        stack.push(79);
        stack.push(90);
        stack.push(88);
        System.out.println(stack.pop());
    }
}
