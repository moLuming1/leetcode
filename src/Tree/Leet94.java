package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }else {
                TreeNode peek = stack.peek();
                stack.pop();
                results.add(peek.val);
                cur=peek.right;
            }
        }
        return results;
    }
}
