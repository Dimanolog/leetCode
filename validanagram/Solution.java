package validanagram;

public class Solution {


    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }


        int[] chars = new int[128];

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            chars[t.charAt(i)]--;
        }

        for (int aChar : chars) {
            if (aChar != 0) {
                return false;
            }
        }


        return true;
    }

}
