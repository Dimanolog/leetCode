package maximumdepthbinarytree;

import common.TreeNode;

public class Solution {

    public int maxDepth(TreeNode root) {
        return getDepth(root, 0);
    }

    private int getDepth(TreeNode root, int depth) {
        if (root != null) {
            depth++;

            int rightDepth = getDepth(root.right, depth);
            int leftDepth = getDepth(root.left, depth);

            return 1 + Math.max(rightDepth, leftDepth);

        }

        return depth;
    }
}
