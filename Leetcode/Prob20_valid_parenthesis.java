package Leetcode;

import java.util.LinkedList;

public class Prob20_valid_parenthesis {
    public boolean isValid(String s) {
        LinkedList<Character> q = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                q.addFirst(c);
            } else {
                if (c == ')')
                    c = '(';
                else if (c == '}')
                    c = '{';
                else
                    c = '[';
                if (q.isEmpty() || c != q.poll())
                    return false;
            }
        }
        if (q.isEmpty())
            return true;
        return false;
    }
}
