package udemy.collections.example_20_synchronized_part_2;

public class Test {
    private int counter = 0;

    public static void main(String[] args) throws InterruptedException {
//        Test test = new Test();
//        while (true) {
//            test.doWork();
//            Thread.sleep(300);
//            test.counter = 0;
//        }

        new Worker().main();
    }

    private void increment() {
        synchronized (this) {
            counter++;
        }
    }

    private void doWork() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}