package addtwonumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean plusOne = false;
        ListNode dummyHead = new ListNode(0);
        ListNode listTail = dummyHead;
        while (l1 != null || l2 != null || plusOne) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int result = (plusOne) ? val1 + val2 + 1 : val1 + val2;

            if (result > 9) {
                result = result - 10;
                plusOne = true;
            } else {
                plusOne = false;
            }

            ListNode newNode = new ListNode(result);
            listTail.next = newNode;
            listTail = newNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next;
    }
}
