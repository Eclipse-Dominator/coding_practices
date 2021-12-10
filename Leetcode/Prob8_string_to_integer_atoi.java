package Leetcode;

public class Prob8_string_to_integer_atoi {
    public int myAtoi(String s) {
        if (s.length() == 0)
            return 0;
        int i = 0;
        long integer = 0;
        int sign = 1;
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                sign = 1;
                i++;
            }
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                integer = integer * 10 + (s.charAt(i++) - '0');
                if (integer > Integer.MAX_VALUE) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
        }

        return (int) (integer * sign);
    }
}
