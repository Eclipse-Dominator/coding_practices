package Leetcode;

import java.util.Arrays;

public class Prob0016_3sum_closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int currSum, closestSum = Integer.MAX_VALUE - target, tmpTarget, l, r;
        for (int i = 0; i < nums.length - 2; i++) {
            tmpTarget = target - nums[i];
            l = i + 1;
            r = nums.length - 1;
            while (l < r) {
                currSum = nums[l] + nums[r];
                if (currSum == tmpTarget)
                    return target;
                if (currSum < tmpTarget)
                    l++;
                else
                    r--;
                if (Math.abs(tmpTarget - currSum) < Math.abs(target - closestSum)) {
                    closestSum = currSum + nums[i];
                }
            }
        }
        return closestSum;
    }
}
