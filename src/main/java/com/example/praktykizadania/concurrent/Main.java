package com.example.praktykizadania.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        // Przykład użycia ExecutorService, Callable i Future
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            System.out.println(Thread.currentThread().getName() + " starts.");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " ends.");
            return 42;
        };

        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Future<Integer> future = executorService.submit(task);
            futures.add(future);
        }

        for (Future<Integer> future : futures) {
            try {
                int result = future.get();
                System.out.println("Result: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();

        // Przykład użycia CompletableFuture
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            System.out.println("CompletableFuture is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("CompletableFuture finished.");
        });

        completableFuture.join();

        // Przykład użycia klas zabezpieczających kolekcje i klas atomowych
        ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("a", 1);
        concurrentMap.put("b", 2);
        concurrentMap.put("c", 3);

        int value = concurrentMap.getOrDefault("d", 0);
        System.out.println("Value for key 'd': " + value);

        AtomicInteger atomicInteger = new AtomicInteger(5);
        atomicInteger.incrementAndGet();
        System.out.println("Atomic Integer value: " + atomicInteger.get());

    }
}
