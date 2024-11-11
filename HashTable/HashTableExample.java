import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Insert key-value pairs
        hashMap.put("Apple", 3);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 5);

        // Retrieve value
        int count = hashMap.get("Banana");
        System.out.println("Banana count: " + count); // Output: 2

        // Iterate through keys
        System.out.println("All Fruits:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
        // Output:
        // Apple: 3
        // Banana: 2
        // Cherry: 5
    }
}
/*
 * Time Complexity:
 * Insertion: O(1) on average
 * Deletion: O(1) on average
 * Search: O(1) on average
 */