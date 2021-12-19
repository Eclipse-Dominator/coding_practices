package Leetcode;

import java.util.List;
import java.util.ArrayList;

public class Prob0119_pascals_triangle_ii {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0)
            return List.of(1);
        if (rowIndex == 1)
            return List.of(1, 1);

        List<Integer> tmp;
        List<Integer> prev = List.of(1, 2, 1);

        for (int i = 3; i <= rowIndex; i++) {
            tmp = new ArrayList<Integer>();
            tmp.add(1);
            for (int j = 1; j < i; j++) {
                tmp.add(prev.get(j - 1) + prev.get(j));
            }
            tmp.add(1);
            prev = tmp;
        }
        return prev;
    }
}
