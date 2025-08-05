package Trees;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right =  null;
    }
}

class random{
    
    public static int count;
    public static int result = -1;
    
    public static void main(String args[]){
        Scanner op = new Scanner(System.in);
        List<Integer> al = new ArrayList<>();
        
        while(op.hasNextInt()){
            int a = op.nextInt();
            if(a == -1) break;
            al.add(a);
        }
        int x = op.nextInt();
        TreeNode root = createBST(al);
        System.out.println(findNumber(root,x));
    }
    
    public static TreeNode createBST(List<Integer> al){
        TreeNode root = new TreeNode(al.get(0));
        int n = al.size();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        int i = 1;
        while(!queue.isEmpty() && i < n){
            TreeNode curr = queue.poll();
            
            if(i < n){
                curr.left = new TreeNode(al.get(i));
                queue.add(curr.left);
            }
            i++;
            if(i < n){
                curr.right = new TreeNode(al.get(i));
                queue.add(curr.right);
            }
            i++;
        }
        return root;
    }
    
    
    public static int findNumber(TreeNode root, int x){
        count = x;
        result = -1;
        helper(root);
        return result;
    }
    
    public static void helper(TreeNode root){
        if(root == null || count == 0){
            return;
        }
        
        helper(root.right);
        
        if(count > 0){
            count--;
            if(count == 0){
                result = root.val;
            }
        }
        
        helper(root.left);
    }
}