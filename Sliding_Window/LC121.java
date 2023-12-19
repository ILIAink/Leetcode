package Sliding_Window;

public class LC121 {
    public static int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int l = 0;
        int r = 0;

        while (r < prices.length) {
            int currSum = prices[r] - prices[l];
            if (prices[l] > prices[r]) {
                l = r;
            } else {
                maxProfit = Math.max(maxProfit, currSum);
                r++;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println(result);
    }
}
