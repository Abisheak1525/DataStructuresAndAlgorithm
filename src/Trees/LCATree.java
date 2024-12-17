package Trees;
//Lowest Common Ansistor
public class LCATree {
    TreeNode root;

    public LCATree() {
        root = null;
    }

    // Insert, delete, and other methods...
    
    public TreeNode findNode(int val) {
        return findNodeRec(root, val);
    }

    private TreeNode findNodeRec(TreeNode node, int val) {
        if (node == null || node.val == val) {
            return node; // Return the node if found or null if not found
        }
        if (val < node.val) {
            return findNodeRec(node.left, val); // Search in the left subtree
        } else {
            return findNodeRec(node.right, val); // Search in the right subtree
        }
    }

    // Find the LCA of two nodes in the BST
    public TreeNode lowestCommonAncestor(TreeNode p, TreeNode q) {
        return findLCA(root, p, q);
    }

    private TreeNode findLCA(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return null;
        }

        // If both p and q are greater than node, then LCA lies in the right subtree
        if (node.val < p.val && node.val < q.val) {
            return findLCA(node.right, p, q);
        }

        // If both p and q are smaller than node, then LCA lies in the left subtree
        if (node.val > p.val && node.val > q.val) {
            return findLCA(node.left, p, q);
        }

        // If one of p or q is equal to the node or they lie on either side of the node, then the node is the LCA
        return node;
    }
    public static void main(String[] args) {
        LCATree bst = new LCATree();

        // Insert values into the BST

        // Nodes to find LCA for
        TreeNode p = bst.findNode(20);
        TreeNode q = bst.findNode(40);

        TreeNode lca = bst.lowestCommonAncestor(p, q);
        System.out.println("LCA of " + p.val + " and " + q.val + " is: " + (lca != null ? lca.val : "None"));
    }
}
