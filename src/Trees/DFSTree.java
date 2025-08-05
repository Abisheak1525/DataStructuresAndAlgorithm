// package Trees;
// /*
//  In-order Traversal (Left, Root, Right)
//  Pre-order Traversal (Root, Left, Right)
//  Post-order Traversal (Left, Right, Root)
//  */

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
    
//     TreeNode(int x) {
//         val = x;
//     }
// }
// public class DFSTree {
//     TreeNode root;

//     public DFSTree() {
//         root = null;
//     }

//     // Insert method to insert elements into the BST
//     private void insert(int value) {
//         root = insertRec(root, value);
//     }

//     private TreeNode insertRec(TreeNode root, int value) {
//         if (root == null) {
//             root = new TreeNode(value);
//             return root;
//         }
        
//         if (value < root.val) {
//             root.left = insertRec(root.left, value);
//         } else if (value > root.val) {
//             root.right = insertRec(root.right, value);
//         }
        
//         return root;
//     }

//     // Pre-order traversal method
//     public void preOrderTraversal(TreeNode node) {
//         if (node != null) {
//             System.out.print(node.val + " ");
//             preOrderTraversal(node.left);
//             preOrderTraversal(node.right);
//         }
//     }

//     // In-order traversal method
//     public void inOrderTraversal(TreeNode node) {
//         if (node != null) {
//             inOrderTraversal(node.left);
//             System.out.print(node.val + " ");
//             inOrderTraversal(node.right);
//         }
//     }
    
//     // Post-order traversal method
//     public void postOrderTraversal(TreeNode node) {
//         if (node != null) {
//             postOrderTraversal(node.left);
//             postOrderTraversal(node.right);
//             System.out.print(node.val + " ");
//         }
//     }


//     public static void main(String[] args) {
//         int[] arr = {5, 3, 8, 2, 4, 7, 9};

//         DFSTree bst = new DFSTree();

//         // Construct the BST from the array
//         for (int num : arr) {
//             bst.insert(num);
//         }

//         // Perform pre-order traversal to print elements
//         System.out.print("Pre-order Traversal: ");
//         bst.preOrderTraversal(bst.root); // Output: 5 3 2 4 8 7 9
        
//         // Perform in-order traversal to print elements in sorted order
//         System.out.print("In-order Traversal (Sorted): ");
//         bst.inOrderTraversal(bst.root); // Output: 2 3 4 5 7 8 9
        
//         // Perform post-order traversal to print elements
//         System.out.print("Post-order Traversal: ");
//         bst.postOrderTraversal(bst.root); // Output: 2 4 3 7 9 8 5

//     }
// }