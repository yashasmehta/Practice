package stampedlock;

public class Main {
    public static void main(String[] args) {
        // Optimistic Read
        SharedResource sharedResource = new SharedResource();

        Thread t1 = new Thread(sharedResource::produce);
        Thread t2 = new Thread(sharedResource::consume);

        t1.start();
        t2.start();
    }
}
