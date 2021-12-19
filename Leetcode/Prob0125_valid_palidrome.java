package Leetcode;

public class Prob0125_valid_palidrome {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        Character left, right;
        while (l < r) {
            left = Character.toLowerCase(s.charAt(l));
            right = Character.toLowerCase(s.charAt(r));
            if (l < s.length() && !Character.isLetterOrDigit(left)) {
                l++;
                continue;
            }
            if (r >= 0 && !Character.isLetterOrDigit(right)) {
                r--;
                continue;
            }
            if (left != right)
                return false;
            l++;
            r--;
        }
        return true;
    }
}
