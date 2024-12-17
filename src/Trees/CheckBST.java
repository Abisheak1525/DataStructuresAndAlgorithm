package Trees;

public class CheckBST {
    TreeNode root;

    public CheckBST() {
        root = null;
    }

    // Insert, delete, and other methods...

    // Check if the tree is a BST
    public boolean isBST() {
        return isBSTRec(root, null, null);
    }

    private boolean isBSTRec(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true; // An empty tree is a BST
        }

        // Check if the current node's value is within the valid range
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        // Recursively check left and right subtrees with updated ranges
        return isBSTRec(node.left, min, node.val) && isBSTRec(node.right, node.val, max);
    }
    public static void main(String[] args) {
        CheckBST bst = new CheckBST();

        // Construct a valid BST

        System.out.println("Is the tree a BST? " + bst.isBST()); // Output: true

        // Construct an invalid BST by violating BST properties
        bst.root.right.left.val = 55; // 55 is less than 70, but in the right subtree of 50

        System.out.println("Is the tree a BST? " + bst.isBST()); // Output: false
    }
}


