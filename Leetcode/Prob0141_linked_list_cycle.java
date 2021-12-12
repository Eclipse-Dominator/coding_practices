package Leetcode;

public class Prob0141_linked_list_cycle {
    public boolean hasCycle(ListNode head) {
        // O(1) memory -> mark node's val as intMax for visited
        if (head == null)
            return false;
        if (head.val == Integer.MAX_VALUE)
            return true;
        head.val = Integer.MAX_VALUE;
        return hasCycle(head.next);
    }
}
