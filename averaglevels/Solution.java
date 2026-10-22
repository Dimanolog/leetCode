package averaglevels;

import common.TreeNode;

import java.util.*;

public class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<TreeNode> deque = new ArrayList<>();
        deque.add(root);
        List<Double> result = new ArrayList<>();

        while (!deque.isEmpty()) {
            int size = deque.size();
            int sumOfLeveles = 0;
            for (int i = 0; i < size; i++) {
                TreeNode treeNode =  deque.removeFirst();

                sumOfLeveles = sumOfLeveles + treeNode.val;

                if (treeNode.left != null) {
                    deque.add(treeNode.left);
                }

                if (treeNode.right != null) {
                    deque.add(treeNode.right);
                }
            }

            result.add((double) sumOfLeveles / size);

        }

        return result;

    }
}
