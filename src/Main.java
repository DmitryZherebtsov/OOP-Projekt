import java.util.ArrayList;
import java.util.List;public class Main {
    public static void main(String[] args) {
        // Inicjalizacja planneru zadań
        TaskPlanner taskPlanner = new TaskPlanner();

        // Dodanie użytkownika
        User user1 = new User(1, "Marcin");
        taskPlanner.addUser(user1);

        // Dodanie zadania użytkownikowi
        Task task1 = new Task(404, "Buy groceries");
        user1.addTask(task1);

        // Oznaczenie zadania jako ukończone
        task1.markCompleted();

        // Pobranie listy zadań użytkownika
        List<Task> user1Tasks = user1.getTasks();

        // Usunięcie zadania użytkownika
        /*user1.removeTask(task1);*/

        // Usunięcie użytkownika
        /*taskPlanner.removeUser(user1.getUserId());*/

        // Wyświetlenie wyników na konsoli
        displayResults(user1);
    }


    // Wyświetlenie wyników na konsoli za pomocą displayResults
    private static void displayResults(User user) {
        System.out.println("Wyniki dla użytkownika " + user.getUsername() + ":");
        List<Task> tasks = user.getTasks();
        for (Task task : tasks) {
            System.out.println("ID zadania: " + task.getTaskId());
            System.out.println("Opis zadania: " + task.getDescription());
            System.out.println("Czy zadanie ukończone? " + task.isCompleted());
            System.out.println("------------");
        }
    }
}