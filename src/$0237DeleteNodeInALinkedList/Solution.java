package $0237DeleteNodeInALinkedList;

import com.leetcode.kit.ListNode;

public class Solution {
    public void deleteNode(ListNode node) {
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
