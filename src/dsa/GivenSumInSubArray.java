package dsa;

import java.util.HashMap;
import java.util.Map;

public class GivenSumInSubArray {
    public void givenSumIndex(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();

        int currSum = 0;
        int start = 0;
        int end = -1;

        for(int i=0 ; i<arr.length; i++) {
            currSum += arr[i];
            if(currSum == sum) {
                start = 0;
                end = i;
                break;
            }

            if(map.containsKey(currSum-sum)) {
                start = map.get(currSum-sum) + 1;
                end = i;
                break;
            }

            map.put(currSum, i);
        }

        if(end == -1) {
            System.out.println("Not found....");
        } else {
            System.out.println("Start: " + start + " End: " + end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,15,-5,15,-10,5};
        int sum = 5;

        GivenSumInSubArray givenSumInSubArray = new GivenSumInSubArray();
        givenSumInSubArray.givenSumIndex(arr, sum);
    }
}
