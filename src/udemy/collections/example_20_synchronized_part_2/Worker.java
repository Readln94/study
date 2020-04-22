package udemy.collections.example_20_synchronized_part_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
            System.out.println("list1.size() = " + list1.size());
            System.out.println("list2.size() = " + list2.size());
        }
    }

    public void main() {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            work();
        });

        Thread thread2 = new Thread(() -> {
            work();
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + " ms to run");
        System.out.println("list1 " + list1.size());
        System.out.println("list2 " + list2.size());
    }
}
