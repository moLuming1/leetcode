package Tree;

import java.util.Stack;

public class Leet404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.add(root);
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    result += node.left.val;
                }
                stack.add(node.left);
            }
        }
        return result;
    }

    public int mySumOfLeftLeaves(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftValue = mySumOfLeftLeaves(root.left);
        int rightValue = mySumOfLeftLeaves(root.right);
        int temp=0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            temp+=root.left.val;
        }
        return  temp+leftValue+rightValue;
    }

}
