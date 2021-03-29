package $0173BinarySearchTreeIterator;

import com.leetcode.kit.TreeNode;

import java.util.Stack;


public class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        while (root != null) {
            stack.add(root);
            root = root.left;
        }
    }
    
    public int next() {
        TreeNode node = stack.pop();
        int res = node.val;
        node = node.right;
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        return res;
    }
    
    public boolean hasNext() {
        return !stack.empty();
    }
}
