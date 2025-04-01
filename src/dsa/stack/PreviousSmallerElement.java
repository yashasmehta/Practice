package dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PreviousSmallerElement {

    public int[] smallerElement(int[] a, int n) {
        int[] result = new int[n];
        //Stack<Integer> stack = new Stack<>();
        Deque<Integer> stack = new ArrayDeque<>(); // recommended

        for(int i=0;i<n;i++) {
            while(!stack.isEmpty() && stack.peek() >= a[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(a[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        PreviousSmallerElement obj = new PreviousSmallerElement();
        int[] a = {4,10,5,18,3,12,7};
        int[] res = obj.smallerElement(a, a.length);

        for (int re : res) {
            System.out.println(re);
        }
    }
}
