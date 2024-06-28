import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {
    static class Student implements Comparable<Student> {
        int rank;
        String name;

        Student(int rank, String name) {
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student(10, "Tendulkar"));
        pq.add(new Student(17, "ABD"));
        pq.add(new Student(7, "Thala"));
        pq.add(new Student(49, "Smithy"));
        pq.add(new Student(18, "Vyrat"));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().rank + "--> " + pq.peek().name);
            pq.remove();
        }

    }
}
