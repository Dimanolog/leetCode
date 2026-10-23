package removeDuplicates;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> integerIntegerMap = Arrays.stream(nums).boxed()
                .collect(Collectors.toMap(Function.identity(), t -> 1, (o1, o2) -> o1 + 1));

        Set<Integer> integers = integerIntegerMap.keySet();
        int n = nums.length / 2;
        for (Integer i : integers) {
            Integer integer = integerIntegerMap.get(i);

            if (integer >= n) {
                return integer;
            }
        }

        return 0;
    }
}
