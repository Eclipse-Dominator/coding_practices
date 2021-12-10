package Leetcode;

public class Prob45_jump_game_ii {
    public int jump(int[] nums) {
        int jumps = 0;
        for (int i = 0, currMax = 0, prevMax = 0; currMax < nums.length - 1; i++) {
            currMax = Math.max(i + nums[i], currMax);
            if (i == prevMax) {
                jumps++;
                prevMax = currMax;
            } else if (currMax >= nums.length - 1)
                jumps++;
        }
        return jumps;
    }
}
