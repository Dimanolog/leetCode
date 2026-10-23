package lengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();

        int lenth = 0;
        int left = 0;

        for (int right = 0; right < chars.length; right++) {
            char bChar = chars[right];
            if (!hashMap.containsKey(bChar) || hashMap.get(bChar) < left) {
                hashMap.put(bChar, right);
                int currentLenth = right - left + 1;
                if (currentLenth > lenth) {
                    lenth = currentLenth;
                }
            } else {
                left = hashMap.get(bChar);
                hashMap.put(bChar, right);
            }
        }

        return lenth;
    }

}
