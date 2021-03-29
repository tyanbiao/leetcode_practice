package $0002AddTwoNumbers;

import com.leetcode.kit.ListNode;
import com.leetcode.kit.Tool;
import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = l1;
        while (l1 != null) {
            l1.val += carry + (l2 != null ? l2.val : 0);
            carry = l1.val / 10;
            l1.val %= 10;

            if (l1.next == null && l2 != null) {
                l1.next = l2.next;
                l2.next = null;
            }
            if (l1.next == null && carry > 0) l1.next = new ListNode(0, null);
            if (l2 != null) l2 = l2.next;
            l1 = l1.next;
        }
        return head;
    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        Solution solution = new Solution();
        StdOut.println(Tool.linkListToString(solution.addTwoNumbers(l1, l2)));
    }
}
