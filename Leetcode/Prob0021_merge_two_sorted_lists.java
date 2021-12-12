package Leetcode;

public class Prob0021_merge_two_sorted_lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2 == null)
            return list1;
        if (list1 == null)
            return list2;
        ListNode head;
        ListNode tmp;
        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        tmp = head;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                tmp.next = list2;
                break;
            } else if (list2 == null) {
                tmp.next = list1;
                break;
            }
            if (list1.val < list2.val) {
                tmp.next = list1;
                list1 = list1.next;
            } else {
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }

        return head;
    }
}
