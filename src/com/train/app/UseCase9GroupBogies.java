package com.train.app;

import java.util.*;
import java.util.stream.Collectors;

// Bogie3 class (separate name to avoid duplicate error)
class Bogie3 {
    String name;
    int capacity;

    // Constructor
    Bogie3(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class UseCase9GroupBogies {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie3> bogies = new ArrayList<>();

        bogies.add(new Bogie3("Sleeper", 72));
        bogies.add(new Bogie3("AC Chair", 56));
        bogies.add(new Bogie3("First Class", 24));
        bogies.add(new Bogie3("Sleeper", 70)); // duplicate for grouping

        // Step 2: Group bogies by type (name)
        Map<String, List<Bogie3>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Step 3: Display grouped result
        System.out.println("Grouped Bogies by Type:\n");

        for (String type : groupedBogies.keySet()) {
            System.out.println("Type: " + type);

            for (Bogie3 b : groupedBogies.get(type)) {
                b.display();
            }

            System.out.println();
        }
    }
}