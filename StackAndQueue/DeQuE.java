package StackAndQueue;
import java.util.ArrayDeque;
import java.util.Deque;
public class DeQuE {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(7);//addLast is same as add
        deque.addFirst(5);

        // print deque elements
        for(int x : deque) System.out.println(x);

        //pop from front and back
        deque.removeFirst();
        deque.removeLast();
        System.out.println("...");
        for(int x: deque) System.out.println(x);
    }
}
