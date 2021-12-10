package Leetcode;

public class Prob0198_house_robber {
    public int rob(int[] nums) {
        // dp current max = max(prev cell, prev 2 cell + current max)
        if (nums.length == 1)
            return nums[0];
        int tmp;
        int a = nums[0];
        int b = Math.max(nums[1], nums[0]);
        for (int i = 2; i < nums.length; i++) {
            tmp = Math.max(a + nums[i], b);
            a = b;
            b = tmp;
        }
        return Math.max(a, b);
    }
}
