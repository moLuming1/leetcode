package Tree;

import java.util.ArrayDeque;
import java.util.Stack;

public class Leet226 {
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if(root!=null){
             stack.push(root);
         }
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.right);
            }

        }

         return root;
    }

    public TreeNode myInvertTree(TreeNode root){
        if(root==null){
            return root;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        myInvertTree(root.left);
        myInvertTree(root.right);
        return root;
    }
}
