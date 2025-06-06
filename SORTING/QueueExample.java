import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("A");
        pq.offer("C");
        pq.offer("D");
        pq.offer("B");

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
