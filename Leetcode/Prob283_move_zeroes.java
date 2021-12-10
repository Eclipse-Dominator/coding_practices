package Leetcode;

public class Prob283_move_zeroes {
    public void moveZeroes(int[] nums) {
        int currentZeroLength = 0;
        for (int i = 0; i < nums.length - currentZeroLength; i++) {
            if (nums[i] == 0)
                currentZeroLength++;
            else
                nums[i - currentZeroLength] = nums[i];

        }
        for (int i = nums.length - currentZeroLength; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    // ^ suboptimal

    public void moveZeroesOptimal(int[] nums) {
        for (int lastNonZeroIndex = 0, i = 0, tmp; i < nums.length; i++) {
            if (nums[i] != 0) {
                tmp = nums[i];
                nums[i] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex++] = tmp;
            }
        }
    }
}