package subsequence;

import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public boolean isSubsequence(String s, String t) {


        int sLen = s.length();
        int tLen = t.length();

        int tIdx = 0;
        int sIdx = 0;

        while (tIdx < tLen || sIdx < sLen){
            if(s.charAt(sIdx) == t.charAt(tIdx)){
                sIdx++;
            }
            tIdx++;
        }

        return sIdx == sLen;



    }

}
