package maxprofit;

public class Solution {

    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int lsf = 0;

        for (int price : prices) {
            buy = Math.min(buy, price);
            lsf = Math.max(lsf, price - buy);
        }

        return lsf;
    }

}
