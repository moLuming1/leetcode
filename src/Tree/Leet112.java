package Tree;

import java.util.Stack;

public class Leet112 {
    public boolean myHasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return traversal(root, targetSum - root.val);
    }

    public boolean traversal(TreeNode root, int targetSum) {
        if (root.left == null && root.right == null && targetSum == 0) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return false;
        }
        if (root.left != null) {
            if (traversal(root.left, targetSum - root.left.val)) {
                return true;
            }
        }
        if (root.right != null) {
            if (traversal(root.right, targetSum - root.right.val)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        if (root != null) {
            stack1.add(root);
            stack2.add(root.val);
        }
        while (!stack1.isEmpty()) {
          int size=stack1.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = stack1.pop();
                Integer sum = stack2.pop();
                if(node.left==null&&node.right==null&&sum==targetSum){
                    return true;
                }
                if(node.right!=null){
                    stack1.add(node.right);
                    stack2.add(sum+node.right.val);
                }
                if(node.left!=null){
                    stack1.add(node.left);
                    stack2.add(sum+node.left.val);
                }
            }

        }
        return false;
    }
}
