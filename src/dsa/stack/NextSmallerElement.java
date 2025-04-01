package dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextSmallerElement {
    public int[] smallerElement(int[] a, int n) {
        int[] result = new int[n];
        //Stack<Integer> stack = new Stack<>();
        Deque<Integer> stack = new ArrayDeque<>(); // recommended

        for(int i=n-1;i>=0;i--) {
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
        NextSmallerElement obj = new NextSmallerElement();
        int[] a = {3,10,5,1,15,10,7,6};
        int[] res = obj.smallerElement(a, a.length);

        for (int re : res) {
            System.out.println(re);
        }
    }
}
