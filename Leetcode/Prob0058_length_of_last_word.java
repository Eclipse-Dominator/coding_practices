package Leetcode;

public class Prob0058_length_of_last_word {
    public int lengthOfLastWord(String s) {
        int start, e;
        for (e = s.length() - 1; e >= 0; e--)
            if (s.charAt(e) != ' ')
                break;
        for (start = e - 1; start >= 0; start--) {
            if (s.charAt(start) == ' ')
                break;
        }

        return e - start;
    }
}
