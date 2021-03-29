package $0101SymmetricTree;


import com.leetcode.kit.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
}
