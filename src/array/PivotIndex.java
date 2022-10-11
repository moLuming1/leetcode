package array;
//724. 寻找数组的中心下标
public class PivotIndex {
    public static int pivotIndex(int[] nums) {

        int sum=0;
        for (int i =0 ; i < nums.length; i++) {
            sum+=nums[i];
        }
        int i,temp=0;

        for ( i = 1; i < nums.length; i++) {
            temp=nums[i];
            nums[i]+=nums[i-1];
            if((nums[i]*2-temp)==sum)break;
        }
        if(nums[0]==sum) return 0;
        if(i==nums.length) return -1;
        else return i;
    }


}
