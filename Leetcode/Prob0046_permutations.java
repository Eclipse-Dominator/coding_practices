package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Prob0046_permutations {
    // using heap algorithm
    List<List<Integer>> permutations;

    public List<List<Integer>> permute(int[] nums) {
        permutations = new ArrayList<>();
        permutate(nums, nums.length);
        return permutations;
    }

    private void permutate(int[] nums, int size) {
        if (size == 1) {
            ArrayList<Integer> tmp = new ArrayList<>(nums.length);
            for (int i : nums)
                tmp.add(i);
            permutations.add(tmp);
            return;
        }
        permutate(nums, size - 1);
        for (int i = 0; i < size - 1; i++) {
            if (size % 2 == 0) {
                swap(nums, i, size - 1);
            } else {
                swap(nums, 0, size - 1);
            }
            permutate(nums, size - 1);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
