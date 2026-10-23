package mypow;

public class Solution {
    public double myPow(double x, int n) {
        if (n == 1) {
            return x;
        }

        if (n == 0) {
            return 1;
        }

        if (n == -1) {
            return -x;
        }
        double result = x;
        for (int i = 0; i < Math.abs(n); i++) {
            result = result * x;
        }


        if (n < 0) {
            x = 1 / x;
        }

        return result;
    }


}
