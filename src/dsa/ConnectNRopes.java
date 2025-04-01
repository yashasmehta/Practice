package dsa;

import java.util.PriorityQueue;

public class ConnectNRopes {
    public int connect(int[] a, int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i: a) {
            queue.add(i);
        }

        int res = 0;
        while(queue.size() > 1) {
            int first = queue.poll();
            int second = queue.poll();
            int cost = first + second;
            res += cost;
            queue.add(cost);
        }

        return res;
    }

    public static void main(String[] args) {
        ConnectNRopes connectNRopes = new ConnectNRopes();
        int[] a = {2,5,4,8,6,9};
        System.out.println("Min Cost: " + connectNRopes.connect(a, a.length));
    }
}
