import java.util.ArrayList;
import java.util.List;

public class ListOne {
    public static void main(String[] args) {
        // Part 3: Java ArrayList Operations

        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(); // Type-safe list

        // Adding elements
        numbers.add(1);               // Equivalent to append in Python
        numbers.add(0, 2);            // Insert at index 0

        // Accessing elements
        int first = numbers.get(0);  // numbers[0] in Python
        int last = numbers.get(numbers.size() - 1); // numbers[-1] in Python

        // Printing accessed elements
        System.out.println("First Element: " + first);
        System.out.println("Last Element: " + last);

        // Removing elements
        numbers.remove(numbers.size() - 1); // pop() in Python
        numbers.remove(Integer.valueOf(1)); // Remove the element with value 1
        numbers.remove(0);                  // Delete element at index 0

        System.out.println("Final List: " + numbers);

        // Part 4: Key Differences

        // 1. Type Safety
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        // nums.add("string"); // Uncommenting this line will result in a compile-time error

        // 2. Method Names and Usage
        nums.add(4); // Add element to the end
        int length = nums.size(); // Get the size of the list

        System.out.println("Size of nums: " + length);

        // 3. Sublist Operations
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(6);

        // Create a sublist (from index 1 to 3, exclusive of 3)
        List<Integer> subset = nums.subList(1, 4);

        System.out.println("Original List: " + nums);
        System.out.println("Sublist (from index 1 to 3): " + subset);
    }
}

