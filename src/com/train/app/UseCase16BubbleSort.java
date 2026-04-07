package com.train.app;

import java.util.*;

public class UseCase16BubbleSort {

    public static void main(String[] args) {

        // Step 1: Create array of capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        printArray(capacities);

        // Step 2: Bubble Sort logic
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Step 3: Display sorted array
        System.out.println("\nSorted Capacities (Ascending):");
        printArray(capacities);
    }

    // Helper method to print array
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}