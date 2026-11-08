package com.leetcode.math.mypow;

/**
 * • Если степень четная: \(x^n = (x^2)^{n/2}\)
 * • Если степень нечетная: \(x^n = x \cdot (x^2)^{(n-1)/2}\)
 */
public class Solution {
    public double myPow(double x, int n) {
        long longN = n;

        if (longN < 0) {
            longN = -longN;
        }

        double result = 1d;
        double currentValue = x;
        while (longN > 0) {
            if (longN % 2 == 1) {
                result *= currentValue;
            }

            currentValue *= currentValue;
            longN /= 2;
        }

        if (n < 0) {
            result = 1 / result;
        }

        return result;
    }
}



