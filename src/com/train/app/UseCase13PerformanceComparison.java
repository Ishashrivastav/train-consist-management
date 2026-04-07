package com.train.app;

import java.util.*;
import java.util.stream.Collectors;

// Bogie5 class (unique to avoid duplicate class error)
class Bogie5 {
    String name;
    int capacity;

    Bogie5(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase13PerformanceComparison {

    public static void main(String[] args) {

        List<Bogie5> bogies = new ArrayList<>();

        // Step 1: Create large dataset
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie5("Sleeper", 72));
            bogies.add(new Bogie5("AC Chair", 56));
            bogies.add(new Bogie5("First Class", 24));
        }

        // 🔹 Loop-based filtering
        long startLoop = System.nanoTime();

        List<Bogie5> loopResult = new ArrayList<>();
        for (Bogie5 b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🔹 Stream-based filtering
        long startStream = System.nanoTime();

        List<Bogie5> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Step 3: Display results
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nLoop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);
    }
}