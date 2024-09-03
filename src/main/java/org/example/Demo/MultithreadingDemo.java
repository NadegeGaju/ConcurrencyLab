package org.example.Demo;

public class MultithreadingDemo {
        public static void main(String[] args) {
            Thread thread1 = new Thread(new Task("Task 1"));
            Thread thread2 = new Thread(new Task("Task 2"));

            thread1.start();  // Task 1 starts in a separate thread
            thread2.start();  // Task 2 starts in another thread
        }
}
