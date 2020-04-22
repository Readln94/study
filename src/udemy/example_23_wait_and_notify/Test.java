package udemy.example_23_wait_and_notify;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(() -> wn.produce());
        Thread thread2 = new Thread(() -> wn.consume());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
