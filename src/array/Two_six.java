package array;

public class Two_six {
    public int removeDuplicates(int[] nums) {
          if(nums==null||nums.length==0) return 0;
          int p=0,q=1;
          while (q<nums.length){
              if(nums[p]!=nums[q]){
                  nums[++p]=nums[q];
              }
              q++;
          }
          return p+1;
    }
}
