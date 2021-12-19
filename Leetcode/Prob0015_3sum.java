package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob0015_3sum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3)
            return List.of();
        Arrays.sort(nums);
        List<List<Integer>> ret = find2Integer(nums, -nums[0], 1, nums[0]);

        for (int i = 1; i < nums.length - 2; i++) {
            if (nums[i] > 0)
                break;
            if (nums[i] != nums[i - 1])
                ret.addAll(find2Integer(nums, -nums[i], i + 1, nums[i]));

        }
        return ret;
    }

    private List<List<Integer>> find2Integer(int[] nums, int target, int left, int initial) {
        List<List<Integer>> ret = new ArrayList<>();
        int right = nums.length - 1, sum;
        while (left < right) {
            sum = nums[left] + nums[right];
            if (sum == target) {
                ret.add(List.of(nums[left], nums[right], initial));
                do {
                    left++;
                } while (nums[left] == nums[left - 1] && left < right);
            } else if (sum > target)
                right--;
            else
                left++;
        }
        return ret;
    }
}
