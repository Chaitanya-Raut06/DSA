import java.util.*;
public class StockProfit {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Manually finding the minimum price
            if (price < minPrice) {
                minPrice = price;
            }
            // Manually finding the maximum profit
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println("Maximum Profit: " + maxProfit(prices)); // Output: 5
    }
}
