package com.train.app;

import java.util.Scanner;

public class UseCase18LinearSearch {

    public static void main(String[] args) {

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 3: Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                break; // stop when found
            }
        }

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID found in the train.");
        } else {
            System.out.println("Bogie ID NOT found.");
        }

        sc.close();
    }
}