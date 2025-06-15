package Trees;

class TreeNode {
    int val;
    TreeNode left, right;
    
    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }
    
    // Insert a value into the BST
    public void insert(int val) {
        root = insertRec(root, val);
    }
    
    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        
        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }
        
        return root;
    }

    //deletion
    public void delete(int val) {
        root = deleteRec(root, val);
    }

    private TreeNode deleteRec(TreeNode root, int val) {

        if (root == null) {
            return root;
        }

        if (val < root.val) {
            root.left = deleteRec(root.left, val);
        } else if (val > root.val) {
            root.right = deleteRec(root.right, val);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.val = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.val);
        }

        return root;
    }

    private int minValue(TreeNode root) {
        int minValue = root.val;
        while (root.left != null) {
            root = root.left;
            minValue = root.val;
        }
        return minValue;
    }

    //Finding Total Nodes
    public int countNodes() {
        return countNodesRec(root);
    }

    private int countNodesRec(TreeNode node) {
        if (node == null) {
            return 0; 
        }
        int leftCount = countNodesRec(node.left);
        int rightCount = countNodesRec(node.right);
        return leftCount + rightCount + 1;
    }

    //Finding Height of Tree

    public int findHeight() {
        return findHeightRec(root);
    }

    private int findHeightRec(TreeNode node) {
        if (node == null) {
            return -1; // Return -1 for null nodes to account for edge count
        }
        int leftHeight = findHeightRec(node.left);
        int rightHeight = findHeightRec(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        //insert
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        //delete
        bst.delete(20); 
        bst.delete(30); 
        bst.delete(50); 

        // Find the height of the tree
        // int height = bst.findHeight();
        
        // Count the number of nodes in the tree
        // int nodeCount = bst.countNodes();

    }
    
}

