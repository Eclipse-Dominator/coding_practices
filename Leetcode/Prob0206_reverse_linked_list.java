package Leetcode;

public class Prob0206_reverse_linked_list {
    public ListNode reverseList(ListNode head) {
        ListNode tmp, prev = null;
        while (head != null) {
            tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }
}
