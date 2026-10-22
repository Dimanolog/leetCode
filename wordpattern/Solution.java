package wordpattern;

import java.util.*;

public class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }
        ArrayList<Object> objects = new ArrayList<>();
        Map<Character, String> characterStringHashMap = new HashMap<>(s.length());
        Map<String, Character> stringCharacterHashMap = new HashMap<>(s.length());

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);

            String checkedWord = characterStringHashMap.get(c);
            Character checkedChar = stringCharacterHashMap.get(words[i]);
            if (checkedWord == null && checkedChar == null) {
                characterStringHashMap.put(c, words[i]);
                stringCharacterHashMap.put(words[i], c);
            } else if (checkedWord == null || checkedChar == null
                    || !checkedWord.equals(words[i]) || !checkedChar.equals(c)) {
                return false;
            }
        }

        return true;
    }

}
