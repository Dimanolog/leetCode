package com.leetcode.tree.sametree;

import com.leetcode.common.TreeNode;

public class Solution {


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        return p != null && q != null
                && p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }


}
