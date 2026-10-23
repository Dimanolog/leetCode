package plusone;

public class Solution {

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            int digit = digits[i] + 1;

            if (digit != 10) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] ans = new int[length + 1];
        ans[0] = 1;

        return ans;

    }


}
