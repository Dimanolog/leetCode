package mergetwolists;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Solution solution = new Solution();

        ListNode listNode = solution.mergeTwoLists(listNode1, listNode2);

        System.out.println(listNode);


    }
}