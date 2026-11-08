package com.dimanolog.tree.sumroottoleafnumbers;


import com.dimanolog.common.TreeNode;

public class Main {

    public static void main(String[] args) {


        Solution solution = new Solution();

        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        int i = solution.sumNumbers(root);

        System.out.println(i);

    }
}
