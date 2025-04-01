package dsa;

import java.util.PriorityQueue;

public class MedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int len = nums1.length + nums2.length;
        int[] nums3 = new int[len];

        int l=0;

        for(int i : nums1) {
            nums3[l++] = i;
        }

        for(int j : nums2) {
            nums3[l++] = j;
        }

        for(int k=0;k<len;k++) {
            if(maxHeap.isEmpty() || maxHeap.peek() >= nums3[k]) {
                maxHeap.add(nums3[k]);
            } else {
                minHeap.add(nums3[k]);
            }

            if(maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if(maxHeap.size() < minHeap.size()) {
                maxHeap.add(minHeap.poll());
            }
        }

        if(maxHeap.size() == minHeap.size()) {
            return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
        } else {
            return maxHeap.peek();
        }
    }

    public static void main(String[] args) {
        MedianOfSortedArrays obj = new MedianOfSortedArrays();
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        obj.findMedianSortedArrays(nums1, nums2);
    }
}
