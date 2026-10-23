package mergetwolists;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode listTail = dummyHead;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                listTail.next = new ListNode(list2.val);
                list2 = list2.next;
            } else if (list2 == null) {
                listTail = new ListNode(list1.val);
                list1 = list1.next;
            } else if (list1.val >= list2.val) {
                listTail.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                listTail.next = new ListNode(list1.val);
                list1 = list1.next;
            }

            listTail = listTail.next;

        }

        return dummyHead.next;
    }
}
