package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Prob0003_longest_substring_wo_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        int currLongest = 0;
        Map<Character, Integer> map = new HashMap<>(s.length());
        for (int i = 0, start = 0; i < s.length(); i++) {
            Character a = s.charAt(i);
            if (map.containsKey(a)) {
                start = Math.max(map.get(a) + 1, start);
            }
            map.put(a, i);
            currLongest = Math.max(i - start + 1, currLongest);
        }
        return currLongest;
    }
}
