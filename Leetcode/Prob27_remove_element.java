package Leetcode;

public class Prob27_remove_element {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[index++] = nums[i];
        }
        return index; // last index included +1 so is the length
    }
}
