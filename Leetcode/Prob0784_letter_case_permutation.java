package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Prob0784_letter_case_permutation {
    List<String> ret;

    public List<String> letterCasePermutation(String s) {
        ret = new ArrayList<>();
        permutate(s, new StringBuilder(), 0);
        return ret;
    }

    private void permutate(String s, StringBuilder builder, int i) {
        if (builder.length() == s.length()) {
            ret.add(builder.toString());
            return;
        }
        Character nextChar = s.charAt(i);
        if (Character.isDigit(nextChar)) {
            builder.append(nextChar);
            permutate(s, builder, i + 1);
        } else {
            permutate(s, new StringBuilder(builder).append(nextChar), i + 1);
            permutate(s, builder.append((char) (nextChar ^ 32)), i + 1);

        }
    }

}
