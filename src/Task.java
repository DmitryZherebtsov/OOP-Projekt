public class Task {
    private int taskId;
    private String description;
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
}
