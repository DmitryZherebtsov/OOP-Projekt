import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String username;
    private List<Task> tasks;

    // Konstruktor
    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
        this.tasks = new ArrayList<>();
    }

    // Metoda do odczytu ID użytkownika
    public int getUserId() {
        return userId;
    }

    // Metoda do odczytu imienia użytkownika
    public String getUsername() {
        return username;
    }

    // Metoda do dodawania zadania
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Metoda do pobierania listy zadań użytkownika
    public List<Task> getTasks() {
        return tasks;
    }

    // Metoda do usuwania zadania
    public void removeTask(Task task) {
        tasks.remove(task);
    }
}
