package Leetcode;

public class Prob26_remove_duplicates_from_sorted_array {
    /*
     * public int removeDuplicates(int[] nums) {
     * if (nums.length == 0)
     * return 0;
     * int distShift = 0;
     * for (int i = 1, prevVal = nums[0]; i < nums.length; i++) {
     * if (nums[i] != prevVal) {
     * nums[i - distShift] = nums[i];
     * } else
     * distShift++;
     * prevVal = nums[i];
     * }
     * return nums.length - distShift;
     * }
     */

    // a more space efficient O(1)
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int actualIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[actualIndex]) {
                nums[++actualIndex] = nums[i];
            }
        }
        return actualIndex + 1;
    }
}
