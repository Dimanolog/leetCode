package array.romantointeger;

public class Solution {


    public int romanToInt(String s) {
        int result = 0;
        int prevNum = 0;
        for (int i = s.length() - 1 ; i >= 0; i--) {
            int currentNum = romanToNumber(s.charAt(i));

            if (prevNum > currentNum) {
                result -= currentNum;
            } else {
                result += currentNum;
                prevNum = currentNum;
            }
        }

        return result;
    }


    private int romanToNumber(char number) {
        switch (number) {
            case 'I': return 1; case 'V': return 5;
            case 'X': return 10; case 'L': return 50;
            case 'C': return 100; case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }


}
