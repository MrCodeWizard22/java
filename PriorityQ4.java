//weakest soldier question ...

import java.util.PriorityQueue;

public class PriorityQ4 {
    static class Row implements Comparable<Row> {
        int sol;
        int idx;

        Row(int sol, int idx) {
            this.sol = sol;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.sol == r2.sol) {
                return this.idx - r2.idx;
            }
            return this.sol - r2.sol;
        }
    }

    public static void main(String... args) {
        int k = 2;
        int army[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }

        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            System.out.println(pq.poll().idx);
        }

    }
}
