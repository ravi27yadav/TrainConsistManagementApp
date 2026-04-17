import java.util.LinkedList;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistLinkedList
 * ============================================================
 *
 * Use Case 4: Maintain Ordered Bogie IDs using LinkedList
 *
 * Description:
 * This program demonstrates how a train consist is maintained
 * in order using LinkedList.
 *
 * Concepts Used:
 * - LinkedList
 * - addFirst(), addLast(), add(index)
 * - removeFirst(), removeLast()
 * - Order preservation
 *
 * @author Ravi Yadav
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry at position 2:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);
    }
}