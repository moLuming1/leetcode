package Tree;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayDeque;

public class Leet617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2!=null){
            return root2;
        }
        if(root1!=null&&root2==null){
            return root1;
        }
        if(root1==null&&root2==null){
            return null;
        }
        TreeNode root = new TreeNode(root1.val + root2.val);
        root.left=mergeTrees(root1.left,root2.left);
        root.right=mergeTrees(root1.right,root2.right);
        return root;
    }

/*    public TreeNode myIteration(TreeNode root1,TreeNode root2){
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root1);
        deque.add(root2);
        while (!deque.isEmpty()){

        }
    }*/



}
