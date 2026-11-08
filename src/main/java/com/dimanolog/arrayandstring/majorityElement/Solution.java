package com.dimanolog.arrayandstring.majorityElement;

public class Solution {

    public int majorityElement(int[] nums) {

        int counter = 0;
        int majorityElement = 0;

        for (int num : nums) {
            if (counter == 0) {
                majorityElement = num;
                ++counter;
            } else if (majorityElement == num) {
                ++counter;
            } else {
                --counter;
            }
        }

        return majorityElement;
    }

}
