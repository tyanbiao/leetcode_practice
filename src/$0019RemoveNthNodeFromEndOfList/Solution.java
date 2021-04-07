package $0019RemoveNthNodeFromEndOfList;

import com.leetcode.kit.ListNode;
import com.leetcode.kit.Tool;
import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode node = dummy;
        ListNode temp = dummy;
        int count = 0;
        while (node != null) {
            if (count++ > n) temp = temp.next;
            node = node.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        solution.removeNthFromEnd(list, 2);
        StdOut.println(Tool.linkListToString(list));
    }
}
