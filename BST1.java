public class BST1 {
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

    // create function
    public static Node insert(Node root, int x) {
        if (root == null) {
            root = new Node(x);
            return root;
        }
        if (root.val < x) {
            root.right = insert(root.right, x);
        } else {
            root.left = insert(root.left, x);
        }
        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // search function
    public static boolean search(Node root, int key) {
        if (root.val == key) {
            return true;
        } else if (root.val < key) {
            return search(root.right, key);
        } else if (root.val > key) {
            return search(root.left, key);
        }
        return false;
    }

    public static void main(String args[]) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println(search(root, 7));
    }
}
