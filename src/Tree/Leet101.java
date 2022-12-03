package Tree;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Leet101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return myCompare(root.left, root.right);
    }

    public boolean myCompare(TreeNode left, TreeNode right) {
        if (left != null && right == null) {
            return false;
        } else if (left == null && right != null) {
            return false;
        } else if (left == null && right == null) {
            return true;
        } else if (left.val != right.val) {
            return false;
        }
        Boolean flag=myCompare(left.left,right.right)&& myCompare(left.right,right.left);
        return flag;
    }

    public boolean myDequ(TreeNode root){
        if(root==null){
            return true;
        }
        Deque<TreeNode> deque=new LinkedList<TreeNode>();
        deque.add(root.left);
        deque.add(root.right);
        while (!deque.isEmpty()){
            TreeNode left = deque.pop();
            TreeNode right = deque.pop();
            if(left==null&&right==null){
                continue;
            }
            if (left != null && right == null) {
                return false;
            } else if (left == null && right != null) {
                return false;
            } else if (left.val != right.val) {
                return false;
            }
            deque.add(left.left);
            deque.add(right.right);
            deque.add(left.right);
            deque.add(right.left);
        }
        return true;
    }


}
