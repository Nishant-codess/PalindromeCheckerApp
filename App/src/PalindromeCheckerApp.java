/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Nishant_Ranjan
 * @version 2.0
 */

public class PalindromeCheckerApp {

    /**
      Application entry point for UC2.
     */
    public static void main(String[] args) {

        // Step 1: Store a hardcoded string literal
        String input = "madam";

        // Step 2: Assume the string is a palindrome initially
        boolean isPalindrome = true;

        // Step 3: Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++)
        {
            // Compare characters from both ends
            if (input.charAt(i) != input.charAt(input.length() - 1 - i))
            {
                // If mismatch found, it's not a palindrome
                isPalindrome = false;
                break;  // Exit loop early
            }
        }

        // Step 4: Display result using conditional statement
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

        // Program exits automatically after main method completes
    }
}