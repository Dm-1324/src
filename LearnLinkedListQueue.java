import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(6);
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println("Queue: "+queue);
        System.out.println(queue.poll());
        System.out.println("Queue: "+queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("Queue: "+queue);
        System.out.println(queue.poll());
        queue.add(3);
        System.out.println("Queue: "+queue);

    }
}
