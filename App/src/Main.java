import java.util.HashSet;
import java.util.Set;

/**
 * ============================================================
 * MAIN CLASS - UniqueBogieTracker
 * ============================================================
 *
 * Use Case 3: Track Unique Bogie IDs using HashSet
 *
 * Description:
 * This program ensures that duplicate bogie IDs are not added
 * to the train using HashSet.
 *
 * Concepts Used:
 * - Set Interface
 * - HashSet
 * - Uniqueness (No duplicates allowed)
 *
 * @author Ravi Yadav
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);

        // Display total count
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
    }
}