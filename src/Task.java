public class Task {
    private final int taskId;
    private final String description;
    private boolean completed;

    // Konstruktor
    public Task(int taskId, String description) {
        this.taskId = taskId;
        this.description = description;
        this.completed = false;
    }

    // Metoda do odczytu ID zadania
    public int getTaskId() {
        return taskId;
    }

    // Metoda do odczytu opisu zadania
    public String getDescription() {
        return description;
    }

    // Metoda do ustawiania zadania jako ukończone
    public void markCompleted() {
        this.completed = true;
    }

    // Metoda do sprawdzania czy zadanie jest ukończone
    public boolean isCompleted() {
        return completed;
    }

    // interfejs
    public interface TaskRepository {
        void saveTask(Task task);
        Task getTask(int taskId);
        void removeTask(Task task);
    }
}
