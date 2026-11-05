package hashmap.longestconsecutivesequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = HashSet.newHashSet(nums.length);
        for (int num : nums) {
            numSet.add(num);
        }

        int currentCount;
        int maxCount = 1;
        int currentNum;
        for (Integer num : numSet) {
            if (!numSet.contains(num - 1)) {
                currentNum = num;
                currentCount = 1;
                while (numSet.contains(++currentNum)) {
                    ++currentCount;
                }

                maxCount = Math.max(currentCount, maxCount);
            }
        }

        return maxCount;
    }
}
