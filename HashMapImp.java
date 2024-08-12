import java.util.*;
// implementing the hashmap 

public class HashMapImp {
    static class Hashmap<k, v> {
        private class Node {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }

        }

        private int N;
        private int n;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public Hashmap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // rehash() function ...
        public void rehash() {
            LinkedList<Node> old[] = buckets;
            buckets = new LinkedList[2 * N];
            N = N * 2;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < old.length; i++) {
                LinkedList<Node> ll = old[i];
                for (int j = 0; j < ll.size(); i++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        // utility functions hashfunction and searchInd...
        private int hashFunction(k key) {
            int ind = key.hashCode();
            return Math.abs(ind) % N;
        }

        private int searchInd(k key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;

            }
            return -1;
        }

        // put() function ...
        public void put(k key, v value) {
            int bi = hashFunction(key);
            int di = searchInd(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(k key) {
            int bi = hashFunction(key);
            int di = searchInd(key, bi);
            if (di != -1) {
                return true;
            }
            return false;

        }

        public v get(k key) {
            int bi = hashFunction(key);
            int di = searchInd(key, bi);
            if (di != -1) {
                return buckets[bi].get(di).value;
            }
            return null;
        }

        public v remove(k key) {
            int bi = hashFunction(key);
            int di = searchInd(key, bi);
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            return null;
        }

        public ArrayList<k> keySet() {
            ArrayList<k> arr = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {

                    arr.add(node.key);
                }

            }
            return arr;
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }

    // main() function ...
    public static void main(String... args) {
        Hashmap<String, Integer> hm = new Hashmap<>();
        hm.put("India", 140);
        hm.put("US", 50);
        hm.put("Aus", 20);
        hm.put("UK", 30);
        hm.put("NZ", 10);
        hm.put("Russia", 40);

        System.out.println(hm.get("NZ"));
        System.out.println(hm.containsKey("Aus"));
        System.out.println(hm.containsKey("Pak"));

        System.out.println(hm.remove("UK"));

        System.out.println(hm.keySet());
        System.out.println(hm.isEmpty());

    }
}
