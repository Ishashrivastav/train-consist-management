package com.train.app;

// Step 1: Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String message) {
        super(message);
    }
}

// Step 2: Goods Bogie class
class GoodsBogie2 {
    String type;
    String cargo;

    GoodsBogie2(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    void assignCargo(String cargo) {
        try {
            // Step 3: Validate safety rule
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be assigned to Rectangular bogie");
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            // Step 4: Handle exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Step 5: Always executes
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }
}

// Step 6: Main class
public class UseCase15SafeCargoAssignment {

    public static void main(String[] args) {

        // Safe case
        GoodsBogie2 b1 = new GoodsBogie2("Cylindrical");
        b1.assignCargo("Petroleum");

        // Unsafe case
        GoodsBogie2 b2 = new GoodsBogie2("Rectangular");
        b2.assignCargo("Petroleum");

        // Program continues
        GoodsBogie2 b3 = new GoodsBogie2("Rectangular");
        b3.assignCargo("Coal");
    }
}