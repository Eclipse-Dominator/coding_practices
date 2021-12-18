package Leetcode;

public class Prob0152_maximum_product_subarray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int curMax = nums[0], curMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int currNum = nums[i];
            int neg = currNum * curMax;
            int pos = currNum * curMin;
            curMax = Math.max(currNum, Math.max(neg, pos));
            curMin = Math.min(currNum, Math.min(neg, pos));
            max = Math.max(max, curMax);
        }
        return max;
    }
    /*
     * public int maxProduct(int[] nums) { // O(n) space sol
     * int[][] numSto = new int[2][nums.length];
     * int currMax = nums[0];
     * numSto[0][0] = nums[0]; // min
     * numSto[1][0] = nums[0]; // max
     * for (int i = 1; i < nums.length; i++) {
     * int currNum = nums[i];
     * int neg = currNum * numSto[1][i - 1];
     * int pos = currNum * numSto[0][i - 1];
     * numSto[0][i] = Math.max(currNum, Math.max(neg, pos));
     * numSto[1][i] = Math.min(currNum, Math.min(neg, pos));
     * currMax = Math.max(currMax, numSto[0][i]);
     * }
     * return currMax;
     * }
     */
}
