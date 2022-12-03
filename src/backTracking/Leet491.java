package backTracking;

import java.util.*;

public class Leet491 {
    public List<List<Integer>> results = new ArrayList<>();
    public LinkedList<Integer> paths = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backTracking(nums, 0);
        return results;
    }

    public void backTracking(int[] nums, int startIndex) {
        if (paths.size()>1) {
            results.add(new ArrayList<>(paths));
        }
        if(startIndex>=nums.length){
            return;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = startIndex; i < nums.length; i++) {
            if(map.getOrDefault(nums[i],0)>=1){
                continue;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(paths.size()==0){
                paths.add(nums[i]);
            }else if(paths.getLast()<=nums[i]){
                paths.add(nums[i]);
            }else {
                continue;
            }


            backTracking(nums, i+1);
            paths.removeLast();
        }

    }









   /* public List<List<Integer>> results = new ArrayList<>();
    public LinkedList<Integer> paths = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> list = new ArrayList<>(nums[0]);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]<=nums[i+1]){
                list.set(i+1, nums[i+1]);
            }else {
                break;
            }
        }
        if(list.size()==1){
            return results;
        }
        backTracking();

        return results;
    }

    public void backTracking(List<Integer> list, int startIndex) {
        if(paths.size()!=1){
            results.add(new ArrayList<>(paths));
        }
        if (paths.size() == list.size()) {
            return;
        }
        for (int i = startIndex; i <list.size() ; i++) {
            paths.add(list.get())

        }

    }*/
}
