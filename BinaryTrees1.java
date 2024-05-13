import java.util.*;

// learning basic concepts of tree : traversals : in , pre, post all are types of dfs but level order --> bfs

public class BinaryTrees1 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    static class Tree {
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

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }

        public static void levelorder(Node root) {
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
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }

        }
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Tree t = new Tree();

        Node root = t.create(arr);
        System.out.println("root data " + root.data);

        System.out.println("Preorder Traversal :... ");
        t.preorder(root);
        System.out.println("Inorder Traversal : ...");
        t.inorder(root);
        System.out.println("Postorder Traversal : ...");
        t.postorder(root);

        System.out.println("Level Order Traversal :...");
        t.levelorder(root);
    }

}
