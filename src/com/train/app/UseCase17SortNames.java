package com.train.app;

import java.util.Arrays;

public class UseCase17SortNames {

    public static void main(String[] args) {

        // Step 1: Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Step 2: Print original array
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 3: Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Step 4: Print sorted array
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
    }
}