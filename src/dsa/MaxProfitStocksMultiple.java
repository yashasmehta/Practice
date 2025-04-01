package dsa;

// [5,2,6,1,4,7,3,6] - multiple buy and sell allowed
public class MaxProfitStocksMultiple {
    public int maxProfitMultiple(int[] arr) {
        int profit = 0;

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                profit += (arr[i] - arr[i-1]);
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,6,1,4,7,3,6};
        MaxProfitStocksMultiple maxProfitStocksMultiple = new MaxProfitStocksMultiple();
        System.out.println("Max Profit: " + maxProfitStocksMultiple.maxProfitMultiple(arr));
    }
}
