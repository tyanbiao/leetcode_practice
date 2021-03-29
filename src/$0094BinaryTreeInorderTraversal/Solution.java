package $0094BinaryTreeInorderTraversal;


import com.leetcode.kit.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        traversal(root, stack);
        while (!stack.empty()) {
            root = stack.pop();
            list.add(root.val);
            traversal(root.right, stack);
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
