package validpalindrome;

public class Solution {

    public boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }

        int lastCharIndex = s.length() - 1;
        int firstCharIndex = 0;

        while (firstCharIndex <= lastCharIndex) {
            char lastChar = s.charAt(lastCharIndex);
            char firstChar = s.charAt(firstCharIndex);

            if (!Character.isLetterOrDigit(firstChar)) {
                firstCharIndex++;

            } else if (!Character.isLetterOrDigit(lastChar)) {
                lastCharIndex--;

            } else if (Character.toLowerCase(lastChar) != Character.toLowerCase(firstChar)) {
                return false;
            }

            firstCharIndex++;
            lastCharIndex--;

        }

        return true;

    }

}
