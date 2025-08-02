package StackAndQueue;
import java.util.LinkedList;
import java.util.Queue;
public class QuEuE {//stack is a class but queue is an interface
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
