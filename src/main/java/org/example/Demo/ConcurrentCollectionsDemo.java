package org.example.Demo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionsDemo {
    public static void main(String[] args) {
        List<String> concurrentList = new CopyOnWriteArrayList<>();

        // Simulate multiple threads writing to the list
        Runnable writerTask = () -> {
            for (int i = 0; i < 5; i++) {
                concurrentList.add(Thread.currentThread().getName() + " - " + i);
            }
        };

        Thread writer1 = new Thread(writerTask);
        Thread writer2 = new Thread(writerTask);

        writer1.start();
        writer2.start();

        // Wait for threads to complete
        try {
            writer1.join();
            writer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the contents of the list
        concurrentList.forEach(System.out::println);
    }
}

