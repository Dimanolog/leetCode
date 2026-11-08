package com.dimanolog.tree.inverttree;

import com.dimanolog.common.TreeNode;

public class Solution {

    public TreeNode invertTree(TreeNode root) {
        doInvertTreeNode(root);
        return root;
    }

    private void doInvertTreeNode(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode temp = root.left;

        root.left = root.right;
        root.right = temp;

        doInvertTreeNode(root.left);
        doInvertTreeNode(root.right);
    }

}
