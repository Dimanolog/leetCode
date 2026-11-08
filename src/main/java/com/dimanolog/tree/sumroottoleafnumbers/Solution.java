package com.dimanolog.tree.sumroottoleafnumbers;


import com.dimanolog.common.TreeNode;

public class Solution {

    public int sumNumbers(TreeNode root) {
        return dfsSum(root, 0);
    }

    private int dfsSum(TreeNode node, int currentSum) {
        if (node == null) {
            return 0;
        }

        currentSum = currentSum * 10 + node.val;

        if (node.left == null && node.right == null) {
            return currentSum;
        }

        return dfsSum(node.left, currentSum) + dfsSum(node.right, currentSum);
    }
}
