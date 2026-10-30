package array.indexfirstoccurrence;

public class Solution {

    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i < hLen - nLen; i++) {
            if (check(haystack, needle, i)) {
                return i;
            }
        }

        return -1;
    }

    private boolean check(String haystack, String needle, int i) {
        for (int j = 0; j < needle.length(); j++) {
            int index = i + j;
            if (haystack.charAt(index) != needle.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
