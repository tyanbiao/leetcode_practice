package $0061RotateList;

import com.leetcode.kit.ListNode;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int n = 1;
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
            n++;
        }

        k = k >= n ? k % n : k;

        n = (n - k) % n;
        node.next = head;
        while (n > 0) {
            node = node.next;
            n--;
        }
        head = node.next;
        node.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        // head.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode res = solution.rotateRight(head, 4);
        while (res != null) {
            System.out.print(res.val);
            res = res.next;
        }
    }

}
