package Leetcode;

public class Prob189_rotate_array {
    public void rotate(int[] nums, int k) { // time O(n), space O(n)
        k %= nums.length;
        int[] tmp = new int[k];
        for (int i = k - 1, j = nums.length - 1; i >= 0; i--, j--) {
            tmp[i] = nums[j];
            if (j - k >= 0)
                nums[j] = nums[j - k];
        }
        for (int i = nums.length - 1 - k; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = tmp[i];
        }
    }
}