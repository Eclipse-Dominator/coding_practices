package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prob350_intersection_of_two_arrays_ii {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>(nums1.length);
        List<Integer> ret = new ArrayList<>(Math.min(nums1.length, nums2.length));
        for (int i : nums1)
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        for (int i : nums2) {
            if (map1.containsKey(i) && map1.get(i) > 0) {
                ret.add(i);
                map1.put(i, map1.get(i) - 1);
            }
        }
        return ret.stream().mapToInt(x -> x).toArray();
    }
}
