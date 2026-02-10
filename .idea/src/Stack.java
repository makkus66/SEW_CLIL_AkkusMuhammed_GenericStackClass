/**
 * Generic Stack class.
 * @param <T> das steht für TYPE und ist ein Platzhalter für den Datentyp für meinem Fall ein Integer oder String
 */
public class Stack<T> {
    private Object[] elements; // Das Array für die Daten
    private int top;           // Der Zeiger für das oberste Element
    private int capacity;      // Maximale Größe

    // Konstruktor 1: Ohne Parameter (Standardgröße 10)
    public Stack() {
        this(10);
    }

    // Konstruktor 2: Mit Parameter für die Größe
    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.top = -1; // -1 heißt: Der Stack ist leer
    }

    // Legt ein Element oben drauf
    public void push(T item) throws StackFullException {
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full!");
        }
        elements[++top] = item;
    }

    // Liest das oberste Element und entfernt es
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty!");
        }
        T item = (T) elements[top]; // Das "Casting" zurück zum Typ T
        elements[top--] = null;     // Platz im Array leeren
        return item;
    }

    // Liest das oberste Element, ohne es zu entfernen
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty!");
        }
        return (T) elements[top];
    }

    // Listet alle Elemente als String auf
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);
            if (i < top) sb.append(";");
        }
        return sb.toString();
    }
}