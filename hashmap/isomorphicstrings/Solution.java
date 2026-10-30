package hashmap.isomorphicstrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public boolean isIsomorphic(String s, String t) {
        int mapLength = Math.min(s.length(), 256);
        Map<Character, Character> sTotMap = new HashMap<>(mapLength, 1);
        Map<Character, Character> tTosMap = new HashMap<>(mapLength, 1);

        for (int i = 0; i < s.length(); i++) {
            char cChar = s.charAt(i);
            Character cCharacter = sTotMap.get(cChar);

            char tChar = t.charAt(i);
            Character tCharacter = tTosMap.get(tChar);

            if (cCharacter == null && tCharacter == null) {
                sTotMap.put(cChar, tChar);
                tTosMap.put(tChar, cChar);

                continue;
            }

            if (cCharacter == null || tCharacter == null) {
                return false;
            }

            if(cChar != tCharacter || tChar != cCharacter){
                return false;
            }
        }

        return true;
    }
}
