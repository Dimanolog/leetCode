package hashmap.caclulateduplicates;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    public void calculateDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        Map<Integer, Integer> duplicateMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum));

        duplicateMap.values().removeIf(value -> value <= 1);


        System.out.println(duplicateMap);


    }

}
