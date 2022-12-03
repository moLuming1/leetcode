package stackAndQueue;

public class Leet239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        MyQueue queue = new MyQueue();
        int length = nums.length - k + 1;
        int[] results = new int[length];
        for (int i = 0; i < k; i++) {
            queue.push(nums[i]);
        }
        results[0]=queue.get();
        for (int i = k; i <nums.length ; i++) {
            queue.poll(nums[i-k]);
            queue.push(nums[i]);
            results[i-k+1]=queue.get();
        }

       return  results;
    }



}
