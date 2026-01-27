package codingProblems;

public class maxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfitSolution(new int[]{10,1,5,6,7,1}));
        System.out.println(maxProfitSolution(new int[]{10,8,7,5,2}));
    }

    public static int maxProfitSolution(int[] prices) {
        int maxProfit = 0;
        if(prices.length <= 1) return maxProfit;

        int i = 0;
        int j = 1;

        // Use sliding method to find max profit
        // if i is greater than j then move i to j position and keeping sliding
        // if j is greater than i than find difference and slide j.

        while(i < prices.length - 1 && j < prices.length) {
            if (prices[i] > prices[j]) {
                i = j;
                j++;
            } else {
                int diff = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, diff);
                j++;
            }
        }

        return maxProfit;
    }
}
