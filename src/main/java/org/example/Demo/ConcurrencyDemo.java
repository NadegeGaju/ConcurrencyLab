package org.example.Demo;

public class ConcurrencyDemo {
        public static void main(String[] args) {
            Task task1 = new Task("Task 1");
            Task task2 = new Task("Task 2");

            task1.run();  // Task 1 is running
            task2.run();  // Task 2 is running
        }
    }

    class Task implements Runnable {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " - iteration " + i);
            }
        }
}
