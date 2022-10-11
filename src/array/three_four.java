package array;

public class three_four {
    public int[] searchRange(int[] nums, int target) {

        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);
        if(leftBorder==-2||rightBorder==-2) return new int[]{-1,-1};
        if(rightBorder-leftBorder>1) return new int[]{leftBorder+1,rightBorder-1};
        return new int[]{-1,-1};

    }

    //得到右边界，不含target
    public int getRightBorder(int[] nums,int target){
        int low=0;
        int high= nums.length-1;
        int rightBorder=-2;
        while (low<=high){
            int middle=low+((high-low)/2);
            if(nums[middle]>target){
                high=middle-1;
            }else{
                low=middle+1;
                rightBorder=low;
            }
        }
        return rightBorder;
    }

    //得到左边界，不含target
    public int getLeftBorder(int[] nums,int target){
        int low=0;
        int high= nums.length-1;
        int leftBorder=-2;
        while (low<=high){
            int middle=low+((high-low)/2);
            if(nums[middle]<target){
                low=middle+1;
            }else{
                high=middle-1;
                leftBorder=high;
            }
        }
        return leftBorder;
    }
}
