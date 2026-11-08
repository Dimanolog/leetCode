package com.dimanolog.linkedlist.removeduplicatesfromsortedlist;

import com.dimanolog.common.ListNode;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curNode = head.next;
        ListNode prevNode = head;

        while (curNode != null) {
            if (curNode.val == prevNode.val) {
                prevNode.next = curNode.next;
            } else {
                prevNode = curNode;
            }

            curNode = curNode.next;
        }

        return head;
    }

}
