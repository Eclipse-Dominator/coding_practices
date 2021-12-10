package Leetcode;

public class Prob0005_longest_palindromic_substring {
    public String longestPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];
        int largestLength = 1;
        int start = 0, end = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j, dp) && j - i + 1 > largestLength) {
                    largestLength = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    private boolean isPalindrome(String s, int i, int j, int[][] dp) { // -1 : not, 1 : is
        if (i > j)
            return true;
        if (dp[i][j] != 0)
            return dp[i][j] == 1;
        if (i == j) {
            dp[i][j] = 1;
            return true;
        }
        if (s.charAt(j) == s.charAt(i) && isPalindrome(s, i + 1, j - 1, dp)) {
            dp[i][j] = 1;
            return true;
        }
        dp[i][j] = -1;
        return false;
    }
}
