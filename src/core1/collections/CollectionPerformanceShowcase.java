package core1.collections;

import java.util.*;

public class CollectionPerformanceShowcase {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        benchmark("ArrayList (Início)", () -> {
            for (int i = 0; i < 100_000; i++) arrayList.add(0, i);
        });

        benchmark("LinkedList (Início)", () -> {
            for (int i = 0; i < 100_000; i++) linkedList.add(0, i);
        });
    }

    private static void benchmark(String name, Runnable task) {
        long start = System.currentTimeMillis();
        task.run();
        System.out.println(name + " levou: " + (System.currentTimeMillis() - start) + "ms");
    }
}
