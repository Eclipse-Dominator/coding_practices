package Leetcode;

public class Prob0067_add_binary {
    public String addBinary(String a, String b) {
        StringBuilder ret = new StringBuilder();
        int carryOver = 0, tmp, valA, valB;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            valA = (i < 0) ? 0 : a.charAt(i) - '0';
            valB = (j < 0) ? 0 : b.charAt(j) - '0';
            tmp = valA + valB + carryOver;
            if (tmp >= 2) {
                tmp -= 2;
                carryOver = 1;
            } else {
                carryOver = 0;
            }
            ret.append(tmp);
        }
        if (carryOver == 1)
            ret.append(1);
        return ret.reverse().toString();
    }
}
