package isvalidbst;

import common.TreeNode;

public class Solution {
    private TreeNode prevNode;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        return validateSearchTree(root);

    }

    private boolean validateSearchTree(TreeNode treeNode) {
        if (treeNode == null) {
            return true;
        }

        if (!validateSearchTree(treeNode.left)) {
            return false;
        }

        if (prevNode != null && prevNode.val >= treeNode.val) {
            return false;
        }

        prevNode = treeNode;

        return validateSearchTree(treeNode.right);
    }
}
