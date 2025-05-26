package StringPrograms;

public class StringContainsSubstring {

    public static void main(String[] args) {
        // Original string
        String str = "naveen is a QA";

        // Substring to check
        String substr = "QA";

        // Split the string into words
        String[] St1 = str.split(" ");

        // Flag to check if the substring is found
        boolean isContains = false;

        // Loop through each word in the array
        for (String str2 : St1) {
            // Compare the word with the substring using .equals()
            if (str2.equals(substr)) {
                isContains = true;
                System.out.println("String has the substring.");
                break; // Exit the loop once the substring is found
            }
        }

        // If substring wasn't found, print "No"
        if (!isContains) {
            System.out.println("No");
        }
    }
}
