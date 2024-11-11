public class BinarySearchExample {
    // Returns index of x if found, else -1
    int binarySearch(int arr[], int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearchExample searcher = new BinarySearchExample();
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int index = searcher.binarySearch(arr, x);

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
        // Output: Element found at index 3
    }
}
/*
 * Time Complexity:
 * Best: O(1)
 * Average: O(log n)
 * Worst: O(log n)
 */