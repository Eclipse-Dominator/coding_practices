package Leetcode;

public class Prob0002_add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode();
        ListNode tmp = ret;
        int carryOver = 0, res;
        while (true) {
            if (l1 == null) {
                l1 = new ListNode(0);
            }

            if (l2 == null) {
                l2 = new ListNode(0);
            }

            res = l1.val + l2.val + carryOver;
            if (res >= 10) {
                carryOver = 1;
                res -= 10;
            } else {
                carryOver = 0;
            }
            tmp.val = res;

            l1 = l1.next;
            l2 = l2.next;
            if (l1 != null || l2 != null || carryOver == 1) {
                tmp.next = new ListNode();
                tmp = tmp.next;
            } else {
                break;
            }
        }
        return ret;
    }
}
