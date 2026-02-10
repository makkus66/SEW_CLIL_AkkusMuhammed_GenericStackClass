/**
 * This class tests the Stack class.
 * It tests a stack with Integer values and a stack with String values.
 */
public class StackTest {

    /**
     * Main method where the test starts.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        // 1. Test: A stack for numbers (Integer)
        Stack<Integer> numberStack = new Stack<>(5);

        // 2. Test: A stack for text (String)
        Stack<String> stringStack = new Stack<>(5);

        try {
            // Number test
            numberStack.push(10);
            numberStack.push(20);
            System.out.println("Numbers: " + numberStack.list());

            // String test
            stringStack.push("Hello");
            stringStack.push("World");
            System.out.println("Strings: " + stringStack.list());

        } catch (Exception e) {
            // If an exception happens, it will be printed here
            System.out.println("Error: " + e.getMessage());
        }
    }
}