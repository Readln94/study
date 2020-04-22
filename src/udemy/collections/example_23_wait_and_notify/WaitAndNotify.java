package udemy.collections.example_23_wait_and_notify;

import java.util.Scanner;

public class WaitAndNotify {
    public void produce() {
        synchronized (this) {
            System.out.println("Producer thread started...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
//            notify();
        }
    }
}
