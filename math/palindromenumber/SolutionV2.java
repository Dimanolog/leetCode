package math.palindromenumber;

public class SolutionV2 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        if (x % 10 == 0) {
            return false;
        }

        int copNum = x;
        long reversedNum = 0;

        while (copNum > 0) {
            reversedNum = reversedNum * 10 + copNum % 10;
            copNum /= 10;
        }

        return reversedNum == x;
    }
}
