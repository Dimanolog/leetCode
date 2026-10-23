package searchInsert;

import java.util.Arrays;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int lastIndex = nums.length - 1;
        int max = lastIndex;
        int mid = 0;
        while (low <= max) {
            mid = low + ((max - low) / 2);

            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                max = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            } else if (nums[mid - 1] < target && (nums[mid + 1] > target)) {
                return mid;
            }
        }


        return nums[mid] > target ? mid : mid + 1;
    }
}
