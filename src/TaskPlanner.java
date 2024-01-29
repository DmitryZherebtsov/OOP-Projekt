import java.util.HashMap;
import java.util.Map;

public class TaskPlanner {
    private final Map<Integer, User> users;

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

    // interfejs
    public interface TaskPlannerService {
        void addUser(User user);
        User getUser(int userId);
        void removeUser(int userId);
        void addTaskToUser(int userId, Task task);
    }

}
