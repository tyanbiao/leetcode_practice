package $0226InvertBinaryTree;

import com.leetcode.kit.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = left;
        return root;
    }
}
