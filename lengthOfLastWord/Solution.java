package lengthOfLastWord;

public class Solution {

    public int lengthOfLastWord(String s) {

        int lastElementIndex = s.length() - 1;
        char whitespace = ' ';
        int counter = 0;

        for (int i = lastElementIndex; i >= 0; i--) {
            if (s.charAt(i) != whitespace) {
                if (i == lastElementIndex) {
                    lastElementIndex--;
                    continue;
                }
                break;
            }
            counter++;
        }

        return counter;


    }
}


