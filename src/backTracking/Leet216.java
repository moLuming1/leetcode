package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet216 {

    public List<List<Integer>> results=new ArrayList<>();
    public LinkedList<Integer> paths=new LinkedList<>();


    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(k,n,1);
        return results;
    }

    public void backTrack(int k,int n,int startIndex){
        if(paths.size()==k){
            int sum=0;
            for (Integer path : paths) {
                sum+=path;
            }
            if(sum==n){
                results.add(new ArrayList<>(paths));
                return;
            }
        }

        for (int i = startIndex; i <10 ; i++) {
            paths.add(i);
            backTrack(k, n, i+1);
            paths.removeLast();
        }

    }

}
