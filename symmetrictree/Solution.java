package symmetrictree;

import common.TreeNode;

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return checkSymmetric(root.right, root.left);
    }

    private boolean checkSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return  node1.val == node2.val && checkSymmetric(node1.left, node2.right) && checkSymmetric(node1.right, node2.left);
    }
}
