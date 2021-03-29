package $0104MaximumDepthOfBinaryTree;

import com.leetcode.kit.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
