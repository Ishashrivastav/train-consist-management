package com.train.app;

import java.util.*;

// Bogie4 class (unique name to avoid duplicate error)
class Bogie4 {
    String name;
    int capacity;

    // Constructor
    Bogie4(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase10TotalSeats {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie4> bogies = new ArrayList<>();

        bogies.add(new Bogie4("Sleeper", 72));
        bogies.add(new Bogie4("AC Chair", 56));
        bogies.add(new Bogie4("First Class", 24));

        // Step 2: Calculate total capacity using map + reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}