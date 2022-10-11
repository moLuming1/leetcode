package array;

public class Leet209 {
    //滑动窗口问题
    public static int minSubArrayLen(int target, int[] nums) {
        int sublen=0; //长度
        int result=nums.length+1; //返回结果
        int i=0; //起点
        int sum=0; //和
        for (int j = 0; j < nums.length; j++) {
            sum+=nums[j];
            while (sum>=target){
                sublen=j-i+1;
                result=result<sublen?result:sublen;
                sum-=nums[i++];
            }
        }
        return result==nums.length+1 ? 0:result;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3,4,5};
        int i = minSubArrayLen(15, ints);
        System.out.println(i);
    }

}
