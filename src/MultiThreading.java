public class MultiThreading implements Runnable {
    public static void main(String[] args) {
        MultiThreading runnable = new MultiThreading();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
