package Leetcode;

public class Prob83_remove_duplicates_from_sorted_list {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode tmp = head.next;
        while (tmp != null) {
            if (tmp.val != prev.val) {
                prev.next = tmp;
                prev = prev.next;
            }
            tmp = tmp.next;
        }
        prev.next = null;
        return head;
    }

    // a more efficient
    public ListNode efficientDeleteDuplicate(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode tmp = head;
        while (tmp != null) {
            if (tmp.val == tmp.next.val)
                tmp.next = tmp.next.next;
            else
                tmp = tmp.next;
        }
        return head;
    }
}
