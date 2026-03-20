import java.util.ArrayList;
import java.util.List;

public class UseCase1InitializeTrain {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty list for bogies
        List<String> bogies = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train initialized.");
        System.out.println("Current number of bogies: " + bogies.size());
    }
}