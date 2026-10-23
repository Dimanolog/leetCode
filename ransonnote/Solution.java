package ransonnote;

import java.util.HashMap;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int magazineLength = magazine.length();

        if (ransomNote.length() > magazineLength) {
            return false;
        }

        int[] charArray = new int[26];

        for (int i = 0; i < magazineLength; i++) {
            charArray[magazine.charAt(i)]++;
        }

        for (int i = 0; i < magazineLength; i++) {
            if (--charArray[ransomNote.charAt(i)] < 0) {
                return false;
            }
        }

        return true;

    }


}
