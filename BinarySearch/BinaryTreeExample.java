class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeExample {
    TreeNode root;

    BinaryTreeExample() {
        root = null;
    }

    // Insert a new node
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive insert
    TreeNode insertRec(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
        return root;
    }

    // In-order traversal
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeExample tree = new BinaryTreeExample();

        /*
         * Let us create following BST
         * 50
         * / \
         * 30 70
         * / \ / \
         * 20 40 60 80
         */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print in-order traversal
        System.out.print("In-order Traversal: ");
        tree.inorder(); // Output: 20 30 40 50 60 70 80
    }
}
/*
 * Time Complexity:
 * Insertion: O(log n) on average
 * Search: O(log n) on average
 * In-order Traversal: O(n)
 */