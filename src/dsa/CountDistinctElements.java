package dsa;

import java.util.HashMap;
import java.util.Map;

// count distinct elements in a window of size k
public class CountDistinctElements {
    public void count(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // first window case
        for(int i=0;i<k;i++) {
            map.put((arr[i]), map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(map.size());
        // remaining windows
        for(int i=k;i<arr.length;i++) {
            if(map.get(arr[i-k]) == 1) {
                map.remove(arr[i-k]);
            } else {
                map.put(arr[i-k], map.get(arr[i-k]) -1);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.println(map.size());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,1,1,3};
        CountDistinctElements countDistinctElements = new CountDistinctElements();
        countDistinctElements.count(arr, 4);
    }
}
