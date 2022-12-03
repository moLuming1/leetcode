package Tree;

import java.util.*;

public class Leet429 {
    /**
     * 解法：队列，迭代。
     * 每次返回每层的最后一个字段即可。
     */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> results = new ArrayList<>();
        Deque<Node> deque = new ArrayDeque<>();
        if (root != null) {
            deque.add(root);
        }
        while (!deque.isEmpty()) {
            int size=deque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node pop = deque.pop();
                list.add(pop.val);
                for (int j = 0; j < pop.children.size(); j++) {
                    if(pop.children.get(j)!=null){
                        deque.add(pop.children.get(j));
                    }
                }
            }
            results.add(list);
        }
        return results;
    }
}
