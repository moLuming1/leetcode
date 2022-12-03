package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet39 {

    public static  List<List<Integer>> results=new ArrayList<>();
    public  static LinkedList<Integer> paths=new LinkedList<>();

    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTracking(candidates, target,0, 0);
        return results;
    }


    public  static void backTracking(int[] candidates,int target,int sum,int startIndex){
        if(sum==target){
            results.add(new ArrayList<>(paths));
            return;
        }
        if(sum>target){
            return;
        }

        for (int i = startIndex; i <candidates.length ; i++) {
            paths.add(candidates[i]);
            backTracking(candidates, target, sum+candidates[i],i);
            paths.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] result={2,3,6,7};
        combinationSum(result, 7);

    }

}
