package $0145BinaryTreePostorderTraversal;

import com.leetcode.kit.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        traversal(root, stack);
        // 用一个变量记录上次出栈的节点
        TreeNode prve = null;
        while (!stack.empty()) {
            root  = stack.pop();
            // 如果上次出栈是当前节点的右节点，就把当前节点出栈
            if (root.right == null || root.right == prve) {
                list.add(root.val);
                prve = root;
            } else {
                stack.add(root);
                traversal(root.right, stack);
            }
        }
        return list;
    }
    public void traversal(TreeNode root, Stack<TreeNode> stack) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }
}
