package prep;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
        left = right = null;
    }    
}

class BST{
    TreeNode root;

    public BST(){
        root = null;
    }

    private void insert(int n){
        root = insertTree(root,n);
    }
    private TreeNode insertTree(TreeNode root,int n){
        if(root == null){
            root = new TreeNode(n);
            return root;
        }

        if(n < root.val){
            root.left = insertTree(root.left, n);
        }
        else if(n > root.val){
            root.right = insertTree(root.right, n);
        }
        return root;
    }

    private void delete(int n){
        root = deleteNode(root,n);
    }
    private TreeNode deleteNode(TreeNode root, int n){
        if(root == null){
            return root;
        }

        if(n < root.val){
            root.left = deleteNode(root.left, n);
        }
        else if(n > root.val){
            root.right = deleteNode(root.right, n);
        }
        else{
            if(root.left == null){
                return root.right; 
            }
            else if(root.right == null){
                return root.left;
            }

            root.val = findMin(root.right);

            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private int findMin(TreeNode root){
        int min = root.val;
        while(root.left !=null){
            root = root.left;
            min = root.val;
        }
        return min;
    }

    private void print(){
        printNode(root);
    }
    private void printNode(TreeNode root){
        if(root == null){
            // System.out.print("Null ");
            return;
        }

        printNode(root.left);
        printNode(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            bst.insert(sc.nextInt());
        }

        System.out.println("Enter node to delete");
        int x = sc.nextInt();
        bst.delete(x);

        bst.print();

        sc.close();
    }
}
