// package Trees;
// class TreeNode {
//     int val;
//     TreeNode left, right;
    
//     public TreeNode(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }
// public class TreeSearch {
//     TreeNode root;

//     public TreeSearch() {
//         root = null;
//     }

//     // Insert, delete, and other methods...

//     // Search for a value in the BST
//     public boolean search(int val) {
//         return searchRec(root, val);
//     }

//     private boolean searchRec(TreeNode root, int val) {
        
//         if (root == null) {
//             return false; // Value not found
//         }

//         if (root.val == val) {
//             return true; // Value found
//         } else if (val < root.val) {
//             return searchRec(root.left, val); // Search in the left subtree
//         } else {
//             return searchRec(root.right, val); // Search in the right subtree
//         }
//     }
//     public static void main(String[] args) {
//         TreeSearch bst = new TreeSearch();

//         // Insert values into the BST
        
//         // Search for values
//         System.out.println(bst.search(20)); // Output: true
//         System.out.println(bst.search(90)); // Output: false
//     }
// }

