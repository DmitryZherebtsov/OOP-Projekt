

// Wyjatek rzucany gdy zadanie nie zostanie odnalezione
class TaskNotFoundException extends RuntimeException {
    // Konstruktor przyjmujacy komunikat o bledzie
    public TaskNotFoundException(String message) {
        // Wywołanie konstruktora klasy nadrzędnej (RuntimeException) z przekazanym komunikatem
        super(message);
    }
}

// Wyjątek rzucany gdy uzytkownik nie zostanie odnaleziony
public class UserNotFoundException extends RuntimeException {
    // Konstruktor przyjmujacy komunikat o bledzie
    public UserNotFoundException(String message) {
        // Wywolanie konstruktorza klasy nadrzednej (RuntimeException) z przekazanym komunikatem
        super(message);
    }
}

