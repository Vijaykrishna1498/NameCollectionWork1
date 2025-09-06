import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Operations {
    public static void main(String[] args) {
        
        // Step 1: Create a list of names
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Ethan");
        System.out.println("Initial List: " + names);

        // Step 2: Add a new name
        names.add("Vijay");
        System.out.println("After adding 'Vijay': " + names);

        // Step 3: Remove a name
        names.remove("Charlie");
        System.out.println("After removing 'Charlie': " + names);

        // Step 4: Update (replace) a name at index 1
        names.set(1, "Robert"); // replaces "Bob" with "Robert"
        System.out.println("After updating index 1 to 'Robert': " + names);

        // Step 5: Search for a name
        boolean exists = names.contains("Diana");
        System.out.println("Does 'Diana' exist? " + exists);

        // Step 6: Sort the list alphabetically
        Collections.sort(names);
        System.out.println("Sorted List: " + names);
    }
}
