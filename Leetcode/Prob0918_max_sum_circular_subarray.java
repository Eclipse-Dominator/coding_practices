package Leetcode;

public class Prob0918_max_sum_circular_subarray {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0;
        for (int i = 0, currMax = 0, currMin = 0; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            max = Math.max(currMax, max);
            currMin = Math.min(nums[i], currMin + nums[i]);
            min = Math.min(currMin, min);
            total += nums[i];
        }
        if (total - min == 0)
            return max;
        return Math.max(max, total - min);
    }
}
