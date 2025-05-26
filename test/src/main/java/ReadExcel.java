public class ReadExcel {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 5, 6, 4, 2, 3, 3};

        // Loop through the array to find duplicates
        for (int i = 0; i < arr.length; i++) {
            // If the current element is already checked, skip it
            boolean isDuplicate = false;

            // Compare the current element with the remaining elements
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    // Mark this as a duplicate
                    isDuplicate = true;
                    arr[j] = -1;  // Change the duplicate element to -1 to mark it
                    break;  // Exit the inner loop after finding the duplicate
                }
            }

            // If a duplicate is found and not already checked, print it
            if (isDuplicate && arr[i] != -1) {
                System.out.println(arr[i]);
            }
        }
    }
}