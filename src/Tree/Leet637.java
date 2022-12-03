package Tree;

import java.util.*;

public class Leet637 {
    public List<Double> averageOfLevels(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<Double> results = new ArrayList<>();
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
            Integer sum=0;
            for (Integer var : list) {
                sum+=var;
            }
            sum/=list.size();
            Double d= Double.valueOf(sum);
            results.add(d);
        }
        return results;
    }
}
