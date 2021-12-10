package Leetcode;

import java.util.HashMap;
//import java.util.List;
import java.util.Map;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;

public class Prob1_two_sum {
    // one-pass hashmap O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }

    // O(nlogn + n) sol (sort and reduce window with 2 pointers)
    /*
     * public int[] twoSum(int[] nums, int target) { List<List<Integer>> arr =
     * IntStream.iterate(0, x -> x + 1).limit(nums.length).boxed() .map(x ->
     * List.of(x, nums[x])).collect(Collectors.toList()); arr.sort((x, y) ->
     * x.get(1) - y.get(1)); int sIndex = 0; int eIndex = nums.length - 1; int s, e;
     * while (sIndex < eIndex) { s = arr.get(sIndex).get(1); e =
     * arr.get(eIndex).get(1); if (s + e == target) { break; } else if (s + e <
     * target) { sIndex++; } else { eIndex--; } }
     * 
     * return new int[] { arr.get(sIndex).get(0), arr.get(eIndex).get(0) }; }
     */

}
