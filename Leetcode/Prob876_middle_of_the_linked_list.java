package Leetcode;

public class Prob876_middle_of_the_linked_list {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        length /= 2;
        while (length-- > 0) {
            head = head.next;
        }
        return head;
    }

    public ListNode fastSlowPointer(ListNode head) { // slightly faster ver
        // 1 2 3 4 5 (odd)
        // 2 3 4 5; 3 4 5
        // 3 4 5; 5

        // 1 2 3 4 5 6 (even)
        // 2 3 4 5 6; 3 4 5 6
        // 3 4 5 6; 5 6
        // 4 5 6; -
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
