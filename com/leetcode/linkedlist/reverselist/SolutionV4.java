package com.leetcode.linkedlist.reverselist;

import com.leetcode.common.ListNode;

public class SolutionV4 {

    public ListNode reverseList(ListNode head) {
        return recursiveReverseList(null, head);
    }

    public ListNode recursiveReverseList(ListNode prev, ListNode current) {
        if (current == null) {
            return prev;
        }

        ListNode next = current.next;
        current.next = prev;

        return recursiveReverseList(current, next);
    }

}
