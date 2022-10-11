package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet18 {


    public List<List<Integer>> fourSum(int[] nums, int target) {
        //构造结果集
        List<List<Integer>> result = new ArrayList<>();
        //双指针法先对数组排序
        Arrays.sort(nums);
        for (int k = 0; k < nums.length; k++) {

            if (nums[k]>0&&nums[k]>target) {
                return result;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            for (int i = k + 1; i < nums.length; i++) {
                int num = nums[k] + nums[i];
                if (i > k+1&& nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = num + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    }else {
                        result.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));

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

        }
        return result;


    }
}
