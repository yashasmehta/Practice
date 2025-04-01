package monitorlock;

public class SharedResource {
    boolean itemAvailable = false;
    public synchronized void addItem() {
        itemAvailable = true;
        System.out.println("Producer Thread Notifying all consumers");
        notifyAll();
    }

    public synchronized void consumeItem() {
        while(!itemAvailable) {
            try {
                System.out.println("Consumer thread is waiting");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumer thread consuming item");
        itemAvailable = false;
    }
}
