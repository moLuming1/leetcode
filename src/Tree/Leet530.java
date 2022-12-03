package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet530 {
    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode current=root;
        while (current!=null||!stack.isEmpty()){
            if(current!=null){
                stack.add(current);
                current=current.left;
            }else {
                TreeNode node = stack.pop();
                list.add(node.val);
                current=node.right;
            }
        }
        int result=Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
             result=Math.min(result,list.get(i)-list.get(i-1));
        }
        return result;
    }
}
