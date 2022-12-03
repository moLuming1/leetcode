package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 */
public class Leet78 {
    public List<List<Integer>> results = new ArrayList<>();
    public LinkedList<Integer> paths = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums, 0);
        return results;
    }

    public void backTracking(int[] nums, int startIndex) {
        results.add(new ArrayList<>(paths));
        if (paths.size() == nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            paths.add(nums[i]);
            backTracking(nums, i + 1);
            paths.removeLast();
        }
    }

   /* public List<List<Integer>> results = new ArrayList<>();
    public LinkedList<Integer> paths=new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        for (int i = 0; i <=nums.length; i++) {
            backTracking(nums, i,0);
        }
        return results;
    }

    public void backTracking(int[] nums,int k,int startIndex){
        if(paths.size()==k){
            results.add(new ArrayList<>(paths));
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            paths.add(nums[i]);
            backTracking(nums,k , i+1);
            paths.removeLast();
        }
    }*/
}
