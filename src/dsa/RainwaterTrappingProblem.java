package dsa;

public class RainwaterTrappingProblem {
    public int maxBlocks(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }

        right[arr.length - 1] = arr[arr.length - 1];

        for(int i = arr.length-2; i>0; i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }

        int ans = 0;
        for(int i = arr.length-2; i>0; i--) {
           ans += (Math.min(left[i], right[i]) - arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4,0,1,3,2};
        RainwaterTrappingProblem rainwaterTrappingProblem = new RainwaterTrappingProblem();
        System.out.println("Max Blocks: " + rainwaterTrappingProblem.maxBlocks(arr));
    }
}
