package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet77 {
    public List<List<Integer>> results=new ArrayList<>();
    public LinkedList<Integer> paths=new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
         backTracking(n,k, 1);
        return results;
    }
    public void backTracking(int n,int k,int startIndex){
        if(paths.size()==k){
            results.add(new ArrayList<>(paths));
            return;
        }
        for (int i = startIndex; i <=n; i++) {
            paths.add(i);
            backTracking(n,k , i+1);
            paths.removeLast();
        }
    }

}
