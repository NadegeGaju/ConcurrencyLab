package org.example.Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1_000_000;

        List<Integer> list = new ArrayList<>();
        List<Integer> concurrentList = new CopyOnWriteArrayList<>();

        // Test ArrayList (non-concurrent)
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList Time: " + (endTime - startTime) + " ns");

        // Test CopyOnWriteArrayList (concurrent)
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            concurrentList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("CopyOnWriteArrayList Time: " + (endTime - startTime) + " ns");
    }
}

