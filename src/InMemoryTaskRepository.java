import java.util.HashMap;
import java.util.Map;

// Implementacja interfejsu Task.TaskRepository przy użyciu wersji przechowującej zadania w pamięci
public class InMemoryTaskRepository implements Task.TaskRepository {
    // Mapa przechowująca zadania, gdzie kluczem jest identyfikator zadania (taskId), a wartością jest obiekt Task
    private final Map<Integer, Task> tasks;

    // Konstruktor inicjalizujący mapę
    public InMemoryTaskRepository() {
        this.tasks = new HashMap<>();
    }

    // Metoda do zapisywania zadania do repozytorium
    @Override
    public void saveTask(Task task) {
        tasks.put(task.getTaskId(), task);
    }

    // Metoda do pobierania zadania z repozytorium na podstawie identyfikatora zadania (taskId)
    @Override
    public Task getTask(int taskId) {
        return tasks.get(taskId);
    }

    // Metoda do usuwania zadania z repozytorium
    @Override
    public void removeTask(Task task) {
        tasks.remove(task.getTaskId());
    }
}
