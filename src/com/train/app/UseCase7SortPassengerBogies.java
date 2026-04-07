import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

// Main class
public class UseCase7SortPassengerBogies {

    public static void main(String[] args) {

        // Step 1: Create List
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add Passenger Bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display sorted bogies
        System.out.println("Passenger Bogies Sorted by Capacity:\n");

        for (Bogie b : bogies) {
            b.display();
        }
    }
}