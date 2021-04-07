package $0098ValidateBinarySearchTree;

import com.leetcode.kit.TreeNode;

import java.util.Stack;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        while (!stack.empty() || root != null) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                TreeNode node = stack.pop();
                if (node.right != null) root = node.right;
                if (prev != null && prev.val >= node.val) return false;
                prev = node;
            }
        }
        return true;
    }
}
