import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees2 {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

    }

    static class Trees {
        static int i = -1;

        public static Node create(int arr[]) {
            i++;
            if (arr[i] == -1) {
                return null;
            }
            Node newnode = new Node(arr[i]);
            newnode.left = create(arr);
            newnode.right = create(arr);

            return newnode;
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.val);
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }

        public static void kLevel(Node root, int level, int k) {
            if (root == null) {
                return;

            }
            if (level == k) {
                System.out.print(root.val + "  ");
                return;
            }
            kLevel(root.left, level + 1, k);
            kLevel(root.right, level + 1, k);

        }
    }

    public static int kAnscestor(Node root, int k, int n) {
        if (root == null) {
            return -1;
        }
        if (root.val == n) {
            return 0;
        }
        int lDist = kAnscestor(root.left, k, n);
        int rDist = kAnscestor(root.right, k, n);
        if (lDist == -1 && rDist == -1) {
            return -1;
        }
        int maxi = Math.max(lDist, rDist);
        if (maxi + 1 == k) {
            System.out.println("\n" + root.val);

        }
        return maxi + 1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Trees t = new Trees();
        Node root = t.create(arr);
        // t.levelOrder(root);

        t.kLevel(root, 1, 3);
        int kth = kAnscestor(root, 2, 5);
    }
}
