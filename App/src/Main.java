import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - PassengerBogieManager
 * ============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This program demonstrates dynamic operations on train bogies
 * using ArrayList such as add, remove, and search.
 *
 * Concepts Used:
 * - ArrayList
 * - add(), remove(), contains()
 * - CRUD operations
 *
 * @author Ravi Yadav
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        // Create ArrayList for passenger bogies
        List<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display after adding
        System.out.println("Bogies after addition:");
        System.out.println(bogies);

        // Remove a bogie
        bogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(bogies);

        // Check existence
        boolean exists = bogies.contains("Sleeper");

        System.out.println("\nIs Sleeper present? " + exists);

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(bogies);
    }
}