package Leetcode;

public class Prob0055_jump_game {
    public boolean canJump(int[] nums) {
        int currMax = 0;
        int currPos = 0;
        while (currMax < nums.length - 1) {
            if (nums[currPos] > 0)
                currMax = Math.max(currMax, currPos + nums[currPos++]);
            else {
                if (currMax > currPos)
                    currPos++;
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
