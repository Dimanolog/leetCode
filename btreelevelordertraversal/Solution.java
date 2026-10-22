package btreelevelordertraversal;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {


    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>(new ArrayList<>());
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        List<List<Integer>> resultList = new ArrayList<>();
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> orderLevelList = new ArrayList<>(size);
            resultList.add(orderLevelList);
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = deque.poll();
                orderLevelList.add(treeNode.val);

                if (treeNode.left != null) {
                    deque.add(treeNode.left);
                }

                if (treeNode.right != null) {
                    deque.add(treeNode.right);
                }
            }
        }

        return resultList;
    }
}
