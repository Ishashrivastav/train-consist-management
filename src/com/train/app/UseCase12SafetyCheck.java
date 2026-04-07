package com.train.app;

import java.util.*;

// GoodsBogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UseCase12SafetyCheck {

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Step 2: Safety check using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        b.type.equals("Cylindrical")
                                ? b.cargo.equals("Petroleum")
                                : true
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFE");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}