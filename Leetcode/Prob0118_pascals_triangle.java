package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Prob0118_pascals_triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll = new ArrayList<>();
        if (numRows == 0)
            return ll;
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        ll.add(tmp);
        if (numRows == 1)
            return ll;
        tmp = new ArrayList<>();
        tmp.add(1);
        tmp.add(1);
        ll.add(tmp);
        for (int i = 2; i < numRows; i++) {
            tmp = new ArrayList<Integer>();
            tmp.add(1);
            for (int j = 1; j < i; j++) {
                tmp.add(ll.get(i - 1).get(j - 1) + ll.get(i - 1).get(j));
            }
            tmp.add(1);
            ll.add(tmp);
        }
        return ll;
    }
}
