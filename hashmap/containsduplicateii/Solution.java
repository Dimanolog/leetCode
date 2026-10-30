package hashmap.containsduplicateii;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> numToIndexMap = new HashMap<>(nums.length, 1);

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            Integer index = numToIndexMap.get(num);

            if (index != null && i - index <= k) {
                return true;
            }

            numToIndexMap.put(num, i);

        }

        return false;


    }
}
