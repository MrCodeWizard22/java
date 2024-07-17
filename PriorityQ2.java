import java.util.PriorityQueue;

public class PriorityQ2 {

    static class Point implements Comparable<Point> {
        int x;
        int y;
        int dist;
        int i;

        Point(int x, int y, int dist, int i) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.i = i;
        }

        public int compareTo(Point p2) {
            return this.dist - p2.dist;
        }

    }

    public static void main(String... args) {
        int arr[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {

            int d = arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1];
            pq.add(new Point(arr[i][0], arr[i][1], d, i));
        }

        for (int j = 0; j < arr.length && j < k; j++) {
            System.out.println(pq.peek().i);
            pq.poll();
        }
    }
}
