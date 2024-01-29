import java.util.HashMap;
import java.util.Map;

public class TaskPlanner {
    private Map<Integer, User> users;

    // Konstruktor
    public TaskPlanner() {
        this.users = new HashMap<>();
    }

    // Metoda do dodawania użytkownika
    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    // Metoda do pobierania użytkownika
    public User getUser(int userId) {
        return users.get(userId);
    }

    // Metoda do usuwania użytkownika
    public void removeUser(int userId) {
        users.remove(userId);
    }
}
