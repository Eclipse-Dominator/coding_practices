package Leetcode;

public class Prob1290_convert_binary_number_in_a_linked_list_to_integer {
    public int getDecimalValue(ListNode head) {
        int val = 0;
        while (head != null) {
            val *= 2;
            val += head.val;
            head = head.next;
        }
        return val;
    }
}
