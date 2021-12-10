package Leetcode;

public class Prob0278_first_bad_version {
    int badver;

    private boolean isBadVersion(int version) {
        return version >= badver;
    }

    public int firstBadVersion(int n) {
        int start = 1, center;
        while (start < n) {
            center = start + (n - start) / 2;
            if (isBadVersion(center)) {
                n = center;
            } else {
                start = center + 1;
            }
        }
        return n;
    }
}
