package dsa;

// [5,2,6,1,4] - Only 1 buy and 1 sell
public class MaxProfitStocks {
    public int maxProfit(int[] arr) {
        int minSoFar = arr[0];
        int maxProfit = 0;

        for(int i=0; i<arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,6,1,4};
        MaxProfitStocks maxProfitStocks = new MaxProfitStocks();
        System.out.println("Max Profit: " + maxProfitStocks.maxProfit(arr));
    }
}
