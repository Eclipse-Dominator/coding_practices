package Leetcode;

public class Prob1446_consecutive_characters {
    public int maxPower(String s) {
        int currentChar = s.charAt(0);
        int currentLength = 1;
        int maxLength = 1;
        int index = 0;
        while (++index < s.length()) {
            if (s.charAt(index) == currentChar) {
                currentLength++;
            } else {
                currentLength = 1;
                currentChar = s.charAt(index);
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
