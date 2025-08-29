import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(2);
        adq.offer(4);
        adq.offer(6);
        adq.offer(8);
        adq.offer(10);
        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(12);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq);

        System.out.println(adq.pollFirst());
        System.out.println(adq);

        System.out.println(adq.pollLast());
        System.out.println(adq);

    }
}
