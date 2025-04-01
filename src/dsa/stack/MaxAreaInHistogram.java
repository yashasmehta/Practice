package dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxAreaInHistogram {
    private int[] previousSmallerElement(int[] a, int n) {
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); // recommended

        for(int i=0;i<n;i++) {
            while(!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(i);
        }

        return result;
    }

    private int[] nextSmallerElement(int[] a, int n) {
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); // recommended

        for(int i=n-1;i>=0;i--) {
            while(!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                result[i] = n;
            } else {
                result[i] = stack.peek();
            }

            stack.push(i);
        }

        return result;
    }

    public int maxArea(int[] a, int n) {
        int[] previousSmaller = previousSmallerElement(a, n);
        int[] nextSmaller = nextSmallerElement(a, n);
        int maxArea = 0;

        for(int i=0;i<n;i++) {
            int area = (nextSmaller[i] - previousSmaller[i] - 1) * a[i];
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        MaxAreaInHistogram obj = new MaxAreaInHistogram();
        int[] a = {4,2,1,5,6,3,2,4,2};
        System.out.println("Max Area: " + obj.maxArea(a, a.length));
    }
}
