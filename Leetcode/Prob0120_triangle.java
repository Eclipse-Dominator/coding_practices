package Leetcode;

import java.util.List;

public class Prob0120_triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> temp;
        int curr;
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                temp = triangle.get(i - 1);
                curr = triangle.get(i).get(j);
                if (j == 0) {
                    triangle.get(i).set(j, temp.get(0) + curr);
                } else if (j == temp.size()) {
                    triangle.get(i).set(j, temp.get(j - 1) + curr);
                } else {
                    triangle.get(i).set(j, Math.min(temp.get(j), temp.get(j - 1)) + curr);
                }
            }
        }

        int ret = Integer.MAX_VALUE;
        for (int i : triangle.get(triangle.size() - 1)) {
            ret = Math.min(ret, i);
        }
        return ret;
    }
}
