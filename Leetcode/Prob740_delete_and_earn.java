package Leetcode;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Prob740_delete_and_earn {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : nums)
            map.compute(i, (key, val) -> (val == null) ? key : val + key);
        Set<Integer> iter = map.keySet();
        int a = 0;
        int b = 0, temp;
        int prevKey = 0;
        for (Integer key : iter) {
            if (prevKey == key - 1)
                temp = Math.max(a + map.get(key), b);
            else
                temp = Math.max(a, b) + map.get(key);
            prevKey = key;
            a = b;
            b = temp;
        }
        return Math.max(a, b);
    }
}
