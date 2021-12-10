package Leetcode;

public class Prob9_palindrome_number {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int cpy = x;
        int a = 0;
        while (cpy > 0) {
            a = a * 10 + cpy % 10;
            cpy /= 10;
        }
        return a == x;
    }
}
