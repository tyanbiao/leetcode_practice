package $0082RemoveDuplicatesFromSortedListII;

import com.leetcode.kit.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prevHead = new ListNode(0, head);
        ListNode prevNode = prevHead;
        while (head != null) {
            boolean isDuplicated = false;
            while (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
                isDuplicated = true;
            }
            if (isDuplicated) {
                prevNode.next = head.next;
            } else {
                prevNode = head;
            }
            head = head.next;
        }
        return prevHead.next;
    }
    public ListNode deleteDuplicatesII(ListNode head) {
       ListNode dummy = new ListNode(0, head);
       ListNode curr = dummy;
       while (curr.next != null && curr.next.next != null) {
           if (curr.next.val == curr.next.next.val) {
               while (curr.next.next != null && curr.next.val == curr.next.next.val) {
                   curr.next.next = curr.next.next.next;
               }
               curr.next = curr.next.next;
           } else {
               curr = curr.next;
           }
       }
       return dummy.next;
    }
}
