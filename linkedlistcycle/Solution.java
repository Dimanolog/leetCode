package linkedlistcycle;


import common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {

        Set<String> listNodeNames = new HashSet<>();
        ListNode listNode = head;

        while(listNode != null){
            if(listNodeNames.contains(listNode.toString())){
                return true;
            }
            listNodeNames.add(listNode.toString());
            listNode = listNode.next;

        }

        return false;
    }
}
