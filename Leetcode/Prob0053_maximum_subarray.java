package Leetcode;

public class Prob0053_maximum_subarray {
    public int maxSubArray(int[] nums) {
        int cummulative = nums[0];
        int maxSum = cummulative;
        for (int i = 1; i < nums.length; i++) {
            cummulative = Math.max(nums[i], cummulative + nums[i]);
            if (cummulative > maxSum)
                maxSum = cummulative;
        }

        return maxSum;
    }
}
