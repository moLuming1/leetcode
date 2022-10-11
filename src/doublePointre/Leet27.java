package doublePointre;

public class Leet27 {

    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        int fastIndex = 0;
        for (fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        return slowIndex;
    }

    public int removeElement2(int[] nums, int val) {
        int slowIndex = 0;
        int fastIndex = nums.length-1;
        while (slowIndex<=fastIndex){
            while (slowIndex<=fastIndex&&nums[slowIndex]!=val){
                slowIndex++;
            }
            while (slowIndex<=fastIndex&&nums[fastIndex]==val){
                fastIndex--;
            }
            if (slowIndex<fastIndex){
                nums[slowIndex++]=nums[fastIndex--];
            }
        }
        return slowIndex;
    }

}
