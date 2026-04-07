package com.train.app;

import java.util.*;

public class UseCase20SearchException {

    public static void main(String[] args) {

        // Step 1: Create bogie list (try empty and non-empty cases)
        List<String> bogieIds = new ArrayList<>();

        // Uncomment below to test valid case
        // bogieIds.add("BG101");
        // bogieIds.add("BG205");

        // Step 2: Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 3: Defensive check
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        // Step 4: Search logic (linear search)
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        // Step 5: Output
        if (found) {
            System.out.println("Bogie ID found.");
        } else {
            System.out.println("Bogie ID NOT found.");
        }

        sc.close();
    }
}