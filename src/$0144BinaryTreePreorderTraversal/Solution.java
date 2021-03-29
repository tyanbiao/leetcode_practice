package $0144BinaryTreePreorderTraversal;

import com.leetcode.kit.TreeNode;

import java.util.LinkedList;
import java.util.List;


public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;
        res.add(root.val);
        preorderTraversal(root.left).forEach(i -> res.add(i));
        preorderTraversal(root.right).forEach(i -> res.add(i));
        return res;
    }
}
