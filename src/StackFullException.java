/**
 * This exception is thrown when someone tries to add
 * an element to a full stack.
 */
public class StackFullException extends Exception {

    /**
     * Creates the exception with a message.
     *
     * @param message the error message
     */
    public StackFullException(String message) {
        super(message);
    }
}