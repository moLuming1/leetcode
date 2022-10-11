package array;

public class Leet283 {
    public void moveZeroes(int[] nums) {
        int length=nums.length;
        int slowIndex=0;
        for (int fastIndex = 0; fastIndex <nums.length ; fastIndex++) {
            if(nums[fastIndex]!=0){
                nums[slowIndex++]=nums[fastIndex];
            }
        }
        for (int i = slowIndex; i < length; i++) {
            nums[i]=0;
        }
    }
}
