import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * Queue (FIFO – First In First Out)
 * Stack (LIFO – Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * If all characters match, the input string is confirmed
 * as a palindrome.
 *
 * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.
 *
 * @author Nishant_Ranjan
 * @version 6.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string to validate
        String input = "civic";

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);   // Enqueue
            stack.push(c);  // Push
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {

            // Remove from front of queue (FIFO)
            char fromQueue = queue.remove();

            // Remove from top of stack (LIFO)
            char fromStack = stack.pop();

            // Compare both characters
            if (fromQueue != fromStack) {
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