package task1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsValueToIndex = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (numsValueToIndex.containsKey(key)) {
                return new int[]{i, numsValueToIndex.get(key)};
            }
            numsValueToIndex.put(nums[i], i);
        }

        return null;
    }
}



