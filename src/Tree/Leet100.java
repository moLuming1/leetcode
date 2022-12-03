package Tree;

import java.util.Deque;
import java.util.LinkedList;

public class Leet100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode root=new TreeNode(1);
        root.left=p;
        root.right=q;
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
            deque.add(right.left);
            deque.add(left.right);
            deque.add(right.right);
        }
        return true;
    }
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
}
