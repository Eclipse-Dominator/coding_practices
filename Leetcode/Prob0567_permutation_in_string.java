package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Prob0567_permutation_in_string {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> mapper = new HashMap<>(s2.length());
        for (Character s : s1.toCharArray()) {
            mapper.compute(s, (k, v) -> (v == null) ? 1 : v + 1);
        }
        char[] arr = s2.toCharArray();
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!mapper.containsKey(arr[i]) || mapper.get(arr[i]) == 0) {
                do {
                    mapper.computeIfPresent(arr[start], (k, v) -> v + 1);
                } while (arr[start++] != arr[i]);
            } else if (i - start + 1 == s1.length())
                return true;
            mapper.computeIfPresent(arr[i], (k, v) -> v - 1);
        }
        return false;
    }
}
