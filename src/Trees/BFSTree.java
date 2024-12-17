package Trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class BFSTree {
    TreeNode root;

    public BFSTree() {
        root = null;
    }

    // Insert method to insert elements into the BST
    private void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        
        if (value < root.val) {
            root.left = insertRec(root.left, value);
        } else if (value > root.val) {
            root.right = insertRec(root.right, value);
        }
        
        return root;
    }

    // BFS traversal method
    public void bfsTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            
            if (node.left != null) {
                queue.offer(node.left);
            }
            
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 4, 7, 9};

        BFSTree bst = new BFSTree();

        // Construct the BST from the array
        for (int num : arr) {
            bst.insert(num);
        }

        // Perform BFS traversal to print elements
        System.out.print("BFS Traversal: ");
        bst.bfsTraversal(bst.root); // Output: 5 3 8 2 4 7 9
    }
}
