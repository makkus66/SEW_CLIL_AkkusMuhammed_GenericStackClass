/**
 * This is a generic Stack class.
 * A stack works with the LIFO principle (Last In First Out).
 * That means the last element added is the first element removed.
 *
 * @param <T> T stands for Type and is a placeholder for the data type (for example Integer or String)
 */
public class Stack<T> {
    private Object[] elements; // Das Array für die Daten
    private int top;           // Der Zeiger für das oberste Element
    private int capacity;      // Maximale Größe

    /**
     * This constructor creates a stack with default size 10.
     */
    public Stack() {
        this(10);
    }

    /**
     * This constructor creates a stack with a specific capacity.
     *
     * @param capacity the maximum number of elements the stack can store
     */
    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.top = -1; // -1 means the stack is empty
    }

    /**
     * This method adds an element on top of the stack.
     *
     * @param item the element that should be added
     * @throws StackFullException if the stack is already full
     */
    public void push(T item) throws StackFullException {
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full!");
        }
        elements[++top] = item;
    }

    /**
     * This method removes the top element and returns it.
     *
     * @return the element that was on top
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty!");
        }
        T item = (T) elements[top]; // casting back to T
        elements[top--] = null;     // free the position
        return item;
    }

    /**
     * This method returns the top element without removing it.
     *
     * @return the element that is currently on top
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty!");
        }
        return (T) elements[top];
    }

    /**
     * This method returns all elements as one String separated with ";".
     *
     * @return all elements in the stack separated by ";"
     */
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);
            if (i < top) sb.append(";");
        }
        return sb.toString();
    }
}