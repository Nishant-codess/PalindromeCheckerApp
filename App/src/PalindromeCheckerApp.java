/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Demonstrates runtime strategy injection.
 *
 * @author Nishant_Ranjan
 * @version 12.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Inject strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);

        if (result) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }
    }
}