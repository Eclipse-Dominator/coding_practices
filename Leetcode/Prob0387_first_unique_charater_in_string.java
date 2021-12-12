package Leetcode;

public class Prob0387_first_unique_charater_in_string {
    public int firstUniqChar(String s) {
        int[] data = new int[26];
        for (int i = 0; i < s.length(); i++) {
            data[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (data[s.charAt(i) - 'a'] == 1)
                return i;
        }

        return -1;
    }
}
