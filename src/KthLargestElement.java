import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static void findKthLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int j : arr) {
            queue.add(j);
        }

        int j = 1;

        while(j<=k) {
            int element = queue.remove();

            if(j == k) {
                System.out.println(element);
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,1,6,5,9};
        int k = 4;

        findKthLargestElement(arr, k);
    }
}
