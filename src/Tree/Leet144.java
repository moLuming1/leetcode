package Tree;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<Integer>();
        if (root == null) {
            return results;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.peek();
            stack.pop();
            results.add(node.val);
            if(node.right!=null){
                stack.add(node.right);
            }
            if(node.left!=null){
                stack.add(node.left);
            }
        }
        return results;
    }

}
