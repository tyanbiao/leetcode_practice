package $0141LinkedListCycle;

import com.leetcode.kit.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode low = head;
        ListNode fast = head.next;
        while (low != null && fast != null) {
            if (low == fast) return true;
            if (fast.next == null) return false;
            low = low.next;
            fast = fast.next.next;
        }
        return false;
    }
}
