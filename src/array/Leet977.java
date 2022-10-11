package array;

public class Leet977 {
    public int[] sortedSquares(int[] nums) {
          int n=nums.length;
          int[] ans = new int[n];
          int i,j,pos;
          for(i=0,j=n-1,pos=n-1;i<=j;){
              if(nums[i]*nums[i]>nums[j]*nums[j]){
                  ans[pos]=nums[i]*nums[i];
                  i++;
              }else{
                  ans[pos]=nums[j]*nums[j];
                  j--;
              }
              pos--;
         }
          return ans;

    }
}
