package Tree;

import java.util.*;
import java.util.stream.Collectors;

public class Leet145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return results;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode peek = stack.peek();
            stack.pop();
            results.add(peek.val);
            if(peek.left!=null){
                stack.push(peek.left);
            }
            if(peek.right!=null){
                stack.push(peek.right);
            }
        }
        /*int size=results.size();
        for (int i = 0; i < size/2; i++) {
            Integer temp=results.get(i);
            results.set(i,results.get(size-i));
            results.set(size-i,temp);
        }*/
        Collections.reverse(results);
        return results;
    }
}
