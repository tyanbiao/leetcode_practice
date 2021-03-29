package $0160IntersectionOfTwoLinkedLists;

import com.leetcode.kit.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int finishedCount = 0;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (finishedCount < 2 && nodeA != null && nodeB != null) {
            if (nodeA == nodeB) return nodeA;
            nodeA = nodeA.next;
            nodeB = nodeB.next;
            if (nodeA == null) {
                nodeA = headB;
                finishedCount++;
            }
            if (nodeB == null) nodeB = headA;

        }
        return null;
    }
}
