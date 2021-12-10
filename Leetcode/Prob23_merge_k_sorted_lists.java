package Leetcode;

import java.util.PriorityQueue;

public class Prob23_merge_k_sorted_lists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode tmp = head;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length + 1, (x, y) -> x.val - y.val);
        for (ListNode node : lists)
            if (node != null)
                pq.add(node);
        // log k insertions.
        while (!pq.isEmpty()) {
            tmp.next = pq.poll();
            tmp = tmp.next;
            if (tmp.next != null)
                pq.add(tmp.next);
        }
        /*
         * // O(kn)
         * int minIndex = 0, minVal;
         * while (true) {
         * minIndex = -1;
         * minVal = Integer.MAX_VALUE;
         * for (int i = 0; i < lists.length; i++) {
         * if (lists[i] == null)
         * continue;
         * if (lists[i].val < minVal) {
         * minVal = lists[i].val;
         * minIndex = i;
         * }
         * }
         * if (minIndex == -1)
         * break;
         * tmp.next = lists[minIndex];
         * tmp = tmp.next;
         * lists[minIndex] = lists[minIndex].next;
         * }
         */
        return head.next;

    }
}
