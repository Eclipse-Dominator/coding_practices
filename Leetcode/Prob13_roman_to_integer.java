package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Prob13_roman_to_integer {
    public int romanToInt(String s) {
        Map<Character, Integer> imap = new HashMap<>(7);
        imap.put('I', 1);
        imap.put('V', 5);
        imap.put('X', 10);
        imap.put('L', 50);
        imap.put('C', 100);
        imap.put('D', 500);
        imap.put('M', 1000);
        int tmp = 0;
        int val = 0;
        int currVal = 0;
        for (Character c : s.toCharArray()) {
            currVal = imap.get(c);
            if (currVal > tmp) {
                tmp = currVal - tmp;
            } else if (currVal < tmp) {
                val += tmp;
                tmp = currVal;
            } else {
                tmp += currVal;
            }
        }
        return val + tmp;
    }
}
