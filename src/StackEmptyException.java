/**
 * This exception is thrown when someone tries to remove or read
 * an element from an empty stack.
 */
public class StackEmptyException extends Exception {

    /**
     * Creates the exception with a message.
     *
     * @param message the error message
     */
    public StackEmptyException(String message) {
        super(message);
    }
}