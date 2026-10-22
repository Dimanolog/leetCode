package minabsolutediffbtree;

import common.TreeNode;

public class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private Integer prev;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);

        return minDiff;

    }

    private void inOrder(TreeNode treeNode) {
        if (treeNode == null || minDiff == 1) {
            return;
        }

        inOrder(treeNode.left);
        if (prev != null){
            minDiff = Math.min(minDiff, treeNode.val - prev);
        }

        prev = treeNode.val;
        inOrder(treeNode.right);
    }


}
