import java.util.Stack;

/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Nishant_Ranjan
 * @version 5.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string
        for (char c : input.toCharArray()) {

            // Pop character from stack (reverse order)
            char poppedChar = stack.pop();

            // Compare original character with popped character
            if (c != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }
    }
}