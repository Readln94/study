package udemy.collections.example_22_producer_consumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> produce());
        Thread thread2 = new Thread(() -> consumer());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    private static void produce() {
        Random random = new Random();

        while(true) {
            try {
                Thread.sleep(500);
                queue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void consumer() {
        while (true) {
            try {
                Thread.sleep(500);
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Queue size is " + queue.size());
        }
    }
}
