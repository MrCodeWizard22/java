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

        // Create function
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

        // preorder Traversal
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }

        // inorder traversal

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        // postorder traversal

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }

        // levelorder traversal
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

        // finding the height of the tree
        public static int findHeight(Node root) {
            if (root == null) {
                return 0;
            }
            int left = findHeight(root.left);
            int right = findHeight(root.right);

            int total = (left > right) ? left + 1 : right + 1;
            return total;
        }

        // finding the number to nodes in the tree
        public static int findNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int left = findNodes(root.left);
            int right = findNodes(root.right);
            int total = left + right + 1;

            return total;
        }

        // sum of data of all nodes
        public static int sumNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int left = sumNodes(root.left);
            int right = sumNodes(root.right);
            int sum = left + right + root.data;
            return sum;
        }

        // function for finding the diameter of the tree(Approach 1)
        public static int findDiameter(Node root) {
            if (root == null) {
                return 0;
            }
            int ld = findDiameter(root.left);
            int rd = findDiameter(root.right);
            int lh = findHeight(root.left);
            int rh = findHeight(root.right);
            int self = lh + rh + 1;

            int dia = Math.max(rh, Math.max(lh, self));

            return dia;
        }

        // writinng 2nd Approach for finding the diameter of the tree
        static class Info {
            int d;
            int h;

            Info(int d, int h) {
                this.d = d;
                this.h = h;
            }
        }

        public static Info diameter2(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            Info lInfo = diameter2(root.left);
            Info rInfo = diameter2(root.right);

            int dia = Math.max(Math.max(lInfo.d, rInfo.d), lInfo.h + rInfo.h + 1);
            int ht = Math.max(lInfo.h, rInfo.h) + 1;

            return new Info(dia, ht);
        }
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Tree t = new Tree();

        Node root = t.create(arr);
        System.out.println("root data " + root.data);

        // System.out.println("Preorder Traversal :... ");
        // t.preorder(root);
        // System.out.println("Inorder Traversal : ...");
        // t.inorder(root);
        // System.out.println("Postorder Traversal : ...");
        // t.postorder(root);

        // System.out.println("Level Order Traversal :...");
        // t.levelorder(root);

        int height = t.findHeight(root);
        System.out.println("The height of the tree is : " + height);

        int num = t.findNodes(root);
        System.out.println("The total number of nodes in tree is : " + num);

        int sum = t.sumNodes(root);
        System.out.println("The sum is : " + sum);

        int dia = t.findDiameter(root);
        System.out.println("The diameter of the tree is : " + dia);

        System.out.println("The diamerte of the tree (found with app2 ) is : " + t.diameter2(root).d);
    }

}
