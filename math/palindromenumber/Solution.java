package math.palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        String string = String.valueOf(x);

        int rightIdx = string.length() - 1;
        int leftIdx = 0;

        while (leftIdx < rightIdx) {
            if (string.charAt(rightIdx) != string.charAt(leftIdx)) {
                return false;
            }

            leftIdx++;
            rightIdx--;
        }

        return true;

    }
}
