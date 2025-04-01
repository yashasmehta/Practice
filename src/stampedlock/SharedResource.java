package stampedlock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int a = 10;
    StampedLock lock = new StampedLock();

    public void produce() {
        long stamp = lock.tryOptimisticRead();

        a = 11;
        System.out.println("Trying to Update the value by " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        if(lock.validate(stamp)) {
            System.out.println("Successfully update the value to " + a);
        } else {
            a = 10;
            System.out.println("Rolling back");
        }
    }

    public void consume() {
        long stamp = lock.writeLock();

        try {
            a = 9;
            System.out.println("Updated the value to " + a + " by " + Thread.currentThread().getName());
        } catch (Exception e) {
            //
        } finally {
            lock.unlock(stamp);
        }
    }
}
