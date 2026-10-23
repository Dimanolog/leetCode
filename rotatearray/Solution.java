package rotatearray;

import java.util.Arrays;

public class Solution {

    public void rotate(int[] nums, int k) {

        int length = nums.length;
        if (k >= length) {
            k = k % length;
        }

        if (k == 0) {
            return;
        }

        int temp;
       /* for (int i = 0; i < length; i++) {
            int shift = (i + k) % length;
            temp = nums[shift];
            nums[shift] = nums[i];
            nums[i] = temp;
        }*/



        int temp1;
        int previous = nums[0];
        int i = 1;
        int index = 0;
        while (i < length) {
            index = index + k;
            if (index >= length) {
                index = Math.abs(index - length);
            }

            temp1 = nums[index];
            nums[index] = previous;
            previous = temp1;
            ++i;
        }

    }
}
