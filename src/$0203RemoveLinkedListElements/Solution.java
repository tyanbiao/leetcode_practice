package $0203RemoveLinkedListElements;

import com.leetcode.kit.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode node = dummy;
        while (node.next != null) {
            if (node.next.val == val) node.next = node.next.next;
            else node = node.next;
        }
        return dummy.next;
    }
}
