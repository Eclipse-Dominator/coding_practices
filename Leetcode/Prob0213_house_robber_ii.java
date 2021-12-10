package Leetcode;

public class Prob0213_house_robber_ii {
    // P(K),P(K + 1) -> P(K+2) = max( P(K) + val(K+2), P(K+1) )
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        int robFirst = nums[0];
        int robFirstProgression = robFirst + nums[2];

        int dontRobFirst = nums[1];
        int dontRobFirstProgression = Math.max(dontRobFirst, nums[2]);

        int tmp;
        for (int i = 3; i < nums.length; i++) {
            tmp = Math.max(robFirst + nums[i], robFirstProgression);
            robFirst = robFirstProgression;
            robFirstProgression = tmp;

            tmp = Math.max(dontRobFirst + nums[i], dontRobFirstProgression);
            dontRobFirst = dontRobFirstProgression;
            dontRobFirstProgression = tmp;
        }
        return Math.max(dontRobFirstProgression, robFirst);
    }
}
