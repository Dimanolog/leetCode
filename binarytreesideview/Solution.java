package binarytreesideview;

import common.TreeNode;

import java.util.*;

public class Solution {

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        List<Integer> result = new ArrayList<>();

        while (!deque.isEmpty()) {
            int size = deque.size();
            int viewedElement = 0;
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = deque.poll();
                viewedElement = treeNode.val;

                if (treeNode.right != null) {
                    deque.add(treeNode.right);
                }

                if (treeNode.left != null) {
                    deque.add(treeNode.left);
                }
            }

            result.add(viewedElement);

        }

        return result;

    }
}
