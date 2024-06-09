import java.util.ArrayList;
import java.util.List;

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
        if (root == null) {
            return false;
        }
        if (root.val == key) {
            return true;
        } else if (root.val < key) {
            return search(root.right, key);
        } else if (root.val > key) {
            return search(root.left, key);
        }
        return false;
    }

    // utility function for printPaths
    public static void print(List<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "--> ");
        }
        System.out.println();
    }

    // printing the paths (root ->leaf)
    public static void printPaths(Node root, List<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        if (root.left == null && root.right == null) {
            print(path);
        }
        printPaths(root.left, path);
        printPaths(root.right, path);
        path.remove(path.size() - 1);
    }

    // mirror of the bst
    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node l = mirror(root.left);
        Node r = mirror(root.right);

        root.left = r;
        root.right = l;
        return root;
    }

    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        try {
            System.out.println(search(root, 7));
        } catch (Exception e) {
            System.out.println(e);
        }
        printPaths(root, new ArrayList<>());

        System.out.println("after mirror");
        root = mirror(root);
        inorder(root);
    }
}
