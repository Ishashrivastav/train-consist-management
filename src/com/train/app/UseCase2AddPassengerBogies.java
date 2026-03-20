import java.util.ArrayList;
import java.util.List;

public class UseCase2AddPassengerBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after addition
        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence of Sleeper
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final list
        System.out.println("Final Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}