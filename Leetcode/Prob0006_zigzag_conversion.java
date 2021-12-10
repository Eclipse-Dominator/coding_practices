package Leetcode;

public class Prob0006_zigzag_conversion {
    public String convert(String s, int numRows) {
        if (s.length() <= numRows)
            return s;
        boolean odd;
        int index, prevIndex = -1, evendiff, odddiff;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            index = i;
            odd = true;
            odddiff = (numRows - 1 - i) * 2;
            evendiff = i * 2;
            while (index < s.length()) {
                if (prevIndex != index)
                    str.append(s.charAt(index));
                if (odd) {
                    prevIndex = index;
                    index += odddiff;
                } else {
                    prevIndex = index;
                    index += evendiff;
                }
                odd = !odd;
            }
        }
        return str.toString();
    }
}