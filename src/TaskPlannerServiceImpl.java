// Implementacja interfejsu TaskPlanner.TaskPlannerService, odpowiedzialna za zarządzanie użytkownikami i zadaniami
public class TaskPlannerServiceImpl implements TaskPlanner.TaskPlannerService {
    // Repozytorium użytkowników, wstrzykiwane jako zależność
    private final User.UserRepository userRepository;

    // Repozytorium zadań, wstrzykiwane jako zależność
    private final Task.TaskRepository taskRepository;

    // Konstruktor inicjalizujący repozytoria
    public TaskPlannerServiceImpl(User.UserRepository userRepository, Task.TaskRepository taskRepository) {
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
    }

    // Metoda do dodawania użytkownika
    @Override
    public void addUser(User user) {
        // Wywołanie metody saveUser z repozytorium użytkowników
        userRepository.saveUser(user);
    }

    // Metoda do pobierania użytkownika na podstawie identyfikatora
    @Override
    public User getUser(int userId) {
        // Wywołanie metody getUser z repozytorium użytkowników
        return userRepository.getUser(userId);
    }

    // Metoda do usuwania użytkownika na podstawie identyfikatora
    @Override
    public void removeUser(int userId) {
        // Wywołanie metody removeUser z repozytorium użytkowników
        userRepository.removeUser(userId);
    }

    // Metoda do dodawania zadania do użytkownika
    @Override
    public void addTaskToUser(int userId, Task task) {
        // Pobranie użytkownika na podstawie identyfikatora
        User user = userRepository.getUser(userId);

        // Sprawdzenie, czy użytkownik istnieje
        if (user != null) {
            // Dodanie zadania do użytkownika
            user.addTask(task);

            // Wywołanie metody saveTask z repozytorium zadań
            taskRepository.saveTask(task);
        }
    }
}
