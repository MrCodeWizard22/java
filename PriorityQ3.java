import java.util.PriorityQueue;

public class PriorityQ3 {

    // minimum cost to join the ropes

    public static void main(String... args) {
        int ropes[] = { 2, 3, 3, 4, 6 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            cost += first + second;
            pq.add(first + second);
        }
        System.out.println(cost);
    }
}
