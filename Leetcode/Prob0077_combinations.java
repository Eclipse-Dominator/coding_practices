package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Prob0077_combinations {
    List<List<Integer>> ret;

    public List<List<Integer>> combine(int n, int k) {
        ret = new ArrayList<>();
        comb(new ArrayList<Integer>(k), 1, n, k);
        return ret;
    }

    private void comb(List<Integer> currList, int choice, int limit, int k) {
        if (k == 0) {
            ret.add(new ArrayList<>(currList));
            return;
        }
        for (int i = choice; i <= limit; i++) {
            currList.add(i);
            comb(currList, i + 1, limit, k - 1);
            currList.remove(currList.size() - 1);
        }

        // if (choice > limit)
        // return;

        // List<Integer> added = new ArrayList<Integer>(currList);
        // added.add(choice);
        // comb(added, choice + 1, limit, k - 1);
        // comb(currList, choice + 1, limit, k);
    }
}
