import java.util.*;

public class InbuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(54);
//        stack.push(24);
//        stack.push(55);
//        stack.push(12);
//        System.out.println(stack.pop());

        // Queue is an interface
//        Queue<Integer> queue = new LinkedList<>() ;
//        queue.add(3);
//        queue.add(6);
//        queue.add(5);
//        queue.add(2);
//        queue.add(7);
//        queue.add(8);
//        System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(78);
        deque.addLast(43);
        deque.removeFirst();
     }
}