package $0234PalindromeLinkedList;

import com.leetcode.kit.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
           sb.append(head.val);
           head = head.next;
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
