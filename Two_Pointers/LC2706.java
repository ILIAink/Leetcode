package Two_Pointers;

import java.util.Arrays;

public class LC2706 {


    // better buyChoco
    public static int buyChoco(int[] prices, int money) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < firstMin) {
                secondMin = firstMin;
                firstMin = price;
            } else {
                secondMin = Math.min(secondMin, price);
            }
        }

        int cost = firstMin + secondMin;

        return money >= cost ? money - cost : money;
    }


    public static int worseBuyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int cost = prices[0] + prices[1];

        return money >= cost ? money - cost : money;

    }


    public static void main(String[] args) {
        int[] prices = {1, 2, 2};
        int money = 3;

        System.out.println(buyChoco(prices, money));
    }

}
