package forkjoinpool;

import java.util.concurrent.RecursiveTask;

public class Computation extends RecursiveTask<Integer> {
    int start;
    int end;

    public Computation(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if(end - start <= 2) {
            for(int i=start;i<=end;i++) {
                sum += i;
            }
            return sum;
        } else {
            int mid = (start + end)/2;

            Computation leftSumTask = new Computation(start, mid);
            Computation rightSumTask = new Computation(mid + 1, end);

            leftSumTask.fork();
            rightSumTask.fork();

            int leftResult = leftSumTask.join();
            int rightResult = rightSumTask.join();
            return leftResult + rightResult;
        }
    }
}
