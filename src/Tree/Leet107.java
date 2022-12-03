package Tree;

import java.util.*;

public class Leet107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Deque<TreeNode> deque = new ArrayDeque<>();
        List<List<Integer>> results = new ArrayList<>();
        if(root!=null) {
            deque.add(root);
        }
        while (!deque.isEmpty()){
            int size=deque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pop();
                list.add(node.val);
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }
            }
            results.add(list);
        }
        Collections.reverse(results);
        return results;
    }
}
