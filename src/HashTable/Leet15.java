package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet15 {

    //使用双指针法
    public List<List<Integer>> threeSum(int[] nums) {
        //制造结果集
        List<List<Integer>> result = new ArrayList<>();
        //双指针法先对数组排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return result;
            }
            //对a去重
            if (i>0&&nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return result;

    }
}
