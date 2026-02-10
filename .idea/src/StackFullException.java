// Diese Klasse erbt von 'Exception', damit Java sie als Fehler erkennt
public class StackFullException extends Exception {
    public StackFullException(String message) {
        // 'super' gibt die Fehlermeldung an die Haupt-Exception-Klasse weiter
        super(message);
    }
}