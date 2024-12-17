package Trees;

public class SuccessorAndPredessor {
    TreeNode root;

    public SuccessorAndPredessor() {
        root = null;
    }

    // Insert, delete, and other methods...

    // Find the successor of a given value in the BST
    public TreeNode findSuccessor(int val) {
        TreeNode node = findNode(root, val);
        if (node == null) {
            return null; // Node not found
        }
        if (node.right != null) {
            // If the node has a right subtree, successor is the minimum value in the right subtree
            return findMinNode(node.right);
        } else {
            // If the node doesn't have a right subtree, successor is in the ancestor chain
            TreeNode successor = null;
            TreeNode current = root;
            while (current != node) {
                if (val < current.val) {
                    successor = current; // Update successor as current if going left
                    current = current.left;
                } else {
                    current = current.right;
                }
            }
            return successor;
        }
    }

    // Find the predecessor of a given value in the BST
    public TreeNode findPredecessor(int val) {
        TreeNode node = findNode(root, val);
        if (node == null) {
            return null; // Node not found
        }
        if (node.left != null) {
            // If the node has a left subtree, predecessor is the maximum value in the left subtree
            return findMaxNode(node.left);
        } else {
            // If the node doesn't have a left subtree, predecessor is in the ancestor chain
            TreeNode predecessor = null;
            TreeNode current = root;
            while (current != node) {
                if (val > current.val) {
                    predecessor = current; // Update predecessor as current if going right
                    current = current.right;
                } else {
                    current = current.left;
                }
            }
            return predecessor;
        }
    }

    // Helper method to find a node with a given value
    private TreeNode findNode(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return findNode(root.left, val);
        } else {
            return findNode(root.right, val);
        }
    }

    // Helper method to find the minimum value node in a subtree
    private TreeNode findMinNode(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Helper method to find the maximum value node in a subtree
    private TreeNode findMaxNode(TreeNode node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    public static void main(String[] args) {
        SuccessorAndPredessor bst = new SuccessorAndPredessor();

        // Insert values into the BST

        // Find successor and predecessor for a given value
        TreeNode successor = bst.findSuccessor(30);
        TreeNode predecessor = bst.findPredecessor(30);

        System.out.println("Successor of 30: " + (successor != null ? successor.val : "None")); // Output: Successor of 30: 40
        System.out.println("Predecessor of 30: " + (predecessor != null ? predecessor.val : "None")); // Output: Predecessor of 30: 20
    }
}
