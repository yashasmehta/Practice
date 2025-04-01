package forkjoinpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Computation computation = new Computation(1, 100);
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool(); // Executors.newWorkStealingPool();
        Future<Integer> totalSum = forkJoinPool.submit(computation);

        try {
            System.out.println(totalSum.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
