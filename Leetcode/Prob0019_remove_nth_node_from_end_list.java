package Leetcode;

public class Prob0019_remove_nth_node_from_end_list {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0, head);
        ListNode node = head;
        int len = 0;
        while (node != null) {
            node = node.next;
            len++;
        }
        node = start;
        len -= n;
        while (len-- > 0)
            node = node.next;
        if (node.next == null)
            node.next = node.next;
        else
            node.next = node.next.next;

        return start.next;
    }
}
