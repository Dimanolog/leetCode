package com.dimanolog.linkedlist.reverselist;

import com.dimanolog.common.ListNode;

public class SolutionV1 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        ListNode temp;
        ListNode tempHead;
        while (current.next != null) {
            tempHead = head;
            temp = current.next.next;
            head = current.next;
            head.next = tempHead;
            current.next = temp;
        }

        return head;


    }


}
