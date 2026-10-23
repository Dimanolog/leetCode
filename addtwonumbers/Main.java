package addtwonumbers;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        Solution solution = new Solution();

        ListNode listNode = solution.addTwoNumbers(listNode1, listNode2);

        System.out.println(listNode);


    }
}