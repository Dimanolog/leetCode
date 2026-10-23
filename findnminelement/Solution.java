package findnminelement;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public List<Integer> findKthMin(int[] nums, int k) {
        PriorityQueue<Integer> integerQueue = new PriorityQueue<>(k, Comparator.reverseOrder());

        for (Integer integer : nums) {
            if (integerQueue.size() < 10) {
                integerQueue.offer(integer);
            } else if (integerQueue.peek() > integer) {
                integerQueue.remove();
                integerQueue.offer(integer);
            }
        }

        return new ArrayList<>(integerQueue);

    }

}
