package linkedlist.reverselist;

import common.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class SolutionV2 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        Deque<ListNode> deque = new ArrayDeque<>();

        ListNode next = head;
        while (next != null) {
            deque.push(next);
            next = next.next;
        }

        head = deque.pop();
        ListNode current = head;

        for (ListNode node : deque) {
            current.next = node;
            current = node;
        }

        current.next = null;

        return head;
    }
}
