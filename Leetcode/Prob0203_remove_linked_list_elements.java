package Leetcode;

public class Prob0203_remove_linked_list_elements {
    public ListNode removeElements(ListNode head, int val) {
        head = new ListNode(0, head);
        ListNode tmp = head;
        while (tmp != null && tmp.next != null) {
            if (tmp.next.val == val)
                tmp.next = tmp.next.next;
            else
                tmp = tmp.next;
        }
        return head.next;
    }
}
