package summaryranges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length < 1) {
            return Collections.emptyList();
        }

        if (nums.length == 1) {
            return List.of(String.valueOf(nums[0]));
        }

        List<String> ranges = new ArrayList<>();

        int number = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (number + count != nums[i]) {
                addRange(ranges, number, count);

                count = 1;
                number = nums[i];

            } else {
                count++;
            }
        }

        addRange(ranges, number, count);


        return ranges;

    }

    private void addRange(List<String> ranges, int number, int count) {
        if (count == 1) {
            ranges.add(String.valueOf(number));
        } else {
            ranges.add(String.format("%s->%s", number, number + count - 1));
        }
    }

}
