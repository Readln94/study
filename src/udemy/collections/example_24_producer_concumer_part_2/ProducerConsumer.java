package udemy.collections.example_24_producer_concumer_part_2;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;

        while(true) {
            synchronized (lock) {
                while(queue.size() == LIMIT) {
                    lock.notify();
                    System.out.println("Producer is waiting!");
                    lock.wait();
                }
                queue.offer(value++);
                System.out.println("Producer is working! Queue size = " + queue.size());
                lock.notify();
                System.out.println("Producer is waiting!");
                lock.wait();
            }
        }
    }

    public void consume() throws InterruptedException {
        while(true) {
            synchronized(lock) {
                while(queue.size() == 0) {
                    lock.notify();
                    System.out.println("Consumer is waiting!");
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println("Consumer is working! Queue size = " + queue.size());
                lock.notify();
                System.out.println("Consumer is waiting!");
                lock.wait();
            }
        }
    }
}
