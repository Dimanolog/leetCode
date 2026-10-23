package pathsum;

import common.TreeNode;

public class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        return checkPathSum(root, targetSum, 0);
    }

    private boolean checkPathSum(TreeNode treeNode, int targetSum, int currentSum) {
        if (treeNode == null) {
            return false;
        }

        if (treeNode.right == null && treeNode.left == null) {
            return targetSum == currentSum;
        }

        return checkPathSum(treeNode.right, targetSum, currentSum + treeNode.val)
                || checkPathSum(treeNode.left, targetSum, currentSum + treeNode.val);


    }

}
