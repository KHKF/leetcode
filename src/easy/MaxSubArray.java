package easy;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int maxArray = 0;
        for (int i = 0; i < nums.length; i++) {
            maxArray += nums[i];
            if (nums[i] > maxArray) {
                maxArray = nums[i];
            }
            max = max > maxArray ? max : maxArray;
        }
        return max;
    }
}

