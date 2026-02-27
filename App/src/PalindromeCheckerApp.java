/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This class demonstrates palindrome validation
 * by reversing the string and comparing it
 * with the original string.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Reverses the string using a loop
 * - Compares original and reversed strings
 * - Displays the result on the console
 *
 * This use case introduces string reversal logic
 * and highlights String immutability.
 *
 * @author Nishant_Ranjan
 * @version 3.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Step 1: Store a hardcoded string
        String original = "madam";

        // Step 2: Create an empty string to store reversed result
        String reversed = "";

        // Step 3: Reverse the string using a for loop
        for (int i = original.length() - 1; i >= 0; i--) {

            // Concatenate each character in reverse order
            reversed = reversed + original.charAt(i);
        }

        // Step 4: Compare original and reversed using equals()
        if (original.equals(reversed)) {

            System.out.println("Original String : " + original);
            System.out.println("Reversed String : " + reversed);
            System.out.println("Result : The string is a Palindrome.");
        } else {

            System.out.println("Original String : " + original);
            System.out.println("Reversed String : " + reversed);
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        // Program exits automatically after execution
    }
}