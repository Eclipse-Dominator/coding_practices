package Leetcode;

public class Prob0242_valid_anagram {
    public boolean isAnagram(String s1, String t) {
        int[] letters = new int[26];
        for (char s : s1.toCharArray()) {
            letters[s - 'a']++;
        }
        for (char s : t.toCharArray()) {
            letters[s - 'a']--;
        }
        for (int i : letters)
            if (i != 0) {
                return false;
            }
        return true;
    }
}
