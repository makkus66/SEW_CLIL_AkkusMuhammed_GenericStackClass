public class StackTest {
    public static void main(String[] args) {
        // 1. Test: Ein Stack für Zahlen (Integer)
        Stack<Integer> numberStack = new Stack<>(5);
        // 2. Test: Ein Stack für Text (String)
        Stack<String> stringStack = new Stack<>(5);

        try {
            // Zahlen-Test
            numberStack.push(10);
            numberStack.push(20);
            System.out.println("Numbers: " + numberStack.list()); // 10;20

            // Text-Test
            stringStack.push("Hello");
            stringStack.push("World");
            System.out.println("Strings: " + stringStack.list()); // Hello;World

        } catch (Exception e) {
            // Falls ein Fehler (Exception) passiert, wird er hier ausgegeben
            System.out.println("Error: " + e.getMessage());
        }
    }
}