package $0083RemoveDuplicatesFromSortedList;

import com.leetcode.kit.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode preNode = head, currNode = head.next;
        while (currNode != null) {
            if (currNode.val == preNode.val) {
                preNode.next = currNode.next;
            } else {
                preNode = currNode;
            }
            currNode = currNode.next;
        }

        return head;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
}
