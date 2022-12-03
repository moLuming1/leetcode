package backTracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leet40 {

    public  List<List<Integer>> results=new ArrayList<>();
    public  LinkedList<Integer> paths=new LinkedList<>();
    boolean[] used;
    int sum=0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          used=new boolean[candidates.length];
          Arrays.fill(used, false);
          Arrays.sort(candidates);
         backTracking(candidates, target, 0);
         return results;
    }


    public void backTracking(int[] candidates, int target,int startIndex) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            results.add(new ArrayList<>(paths));
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            if (i > 0 && candidates[i] == candidates[i - 1] && used[i - 1] == false) {
                continue;
            }
            paths.add(candidates[i]);
            sum += candidates[i];
            used[i] = true;
            backTracking(candidates, target, i + 1);
            used[i] = false;
            sum -= candidates[i];
            paths.removeLast();
        }
    }


}
