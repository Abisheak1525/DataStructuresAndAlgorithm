// package Trees;

// import java.util.NoSuchElementException;

// class TreeNode {
//     int val;
//     TreeNode left, right;
        
//     public TreeNode(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }
// public class FindMinMax {
//     TreeNode root;

//     public FindMinMax() {
//         root = null;
//     }

//     // Insert, delete, and other methods...

//     // Find the minimum value in the BST
//     public int findMin() {
//         if (root == null) {
//             throw new NoSuchElementException("Tree is empty");
//         }
//         return findMinRec(root);
//     }

//     private int findMinRec(TreeNode root) {
//         if (root.left == null) {
//             return root.val; // Minimum value found
//         }
//         return findMinRec(root.left); // Recursively search in the left subtree
//     }

//     // Find the maximum value in the BST
//     public int findMax() {
//         if (root == null) {
//             throw new NoSuchElementException("Tree is empty");
//         }
//         return findMaxRec(root);
//     }

//     private int findMaxRec(TreeNode root) {
//         if (root.right == null) {
//             return root.val; // Maximum value found
//         }
//         return findMaxRec(root.right); // Recursively search in the right subtree
//     }
//     public static void main(String[] args) {
//         FindMinMax bst = new FindMinMax();

//         // Insert values into the BST
        

//         // Find minimum and maximum values
//         System.out.println("Minimum value: " + bst.findMin()); // Output: 20
//         System.out.println("Maximum value: " + bst.findMax()); // Output: 80
//     }
// }

