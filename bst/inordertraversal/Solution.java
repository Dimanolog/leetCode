package bst.inordertraversal;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> valList = new ArrayList<>();

        recursiveTreeInOrderTraversal(root, valList);

        return valList;
    }

    private void recursiveTreeInOrderTraversal(TreeNode treeNode, List<Integer> valList) {
        if (treeNode == null) {
            return;
        }

        recursiveTreeInOrderTraversal(treeNode.left, valList);

        valList.add(treeNode.val);

         recursiveTreeInOrderTraversal(treeNode.right, valList);

    }
}
