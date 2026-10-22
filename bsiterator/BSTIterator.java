package bsiterator;

import common.TreeNode;

import java.util.*;

public class BSTIterator {

    private Deque<TreeNode> stack = new LinkedList<>();

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    public int next() {
        TreeNode pop = stack.pop();
        if (pop.right != null)
            pushLeft(pop.right);

        return pop.val;

    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushLeft(TreeNode treeNode) {
        while (treeNode != null) {
            stack.push(treeNode);
            treeNode = treeNode.left;
        }
    }
}
