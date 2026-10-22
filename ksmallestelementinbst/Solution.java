package ksmallestelementinbst;

import common.TreeNode;

public class Solution {
    private int k;
    private int count;
    private int result;


    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }

        this.k = k;
        this.count = 0;

        inOrder(root);

        return result;
    }

    private void inOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        if (count == k) {
            result = treeNode.val;
        }
        inOrder(treeNode.left);
        count++;
        inOrder(treeNode.right);
    }
}
