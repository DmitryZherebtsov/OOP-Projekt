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

        // Tworzenie instancji InMemoryTaskRepository, która implementuje interfejs Task.TaskRepository
        Task.TaskRepository taskRepository = new InMemoryTaskRepository();

        // Tworzenie instancji InMemoryUserRepository, która implementuje interfejs User.UserRepository
        User.UserRepository userRepository = new InMemoryUserRepository();

        // Tworzenie instancji TaskPlannerServiceImpl, która implementuje interfejs TaskPlanner.TaskPlannerService
        // Przekazywanie stworzonych repozytoriow jako zaleznosci do konstruktora
        TaskPlanner.TaskPlannerService taskPlannerService = new TaskPlannerServiceImpl(userRepository, taskRepository);

        // Uzycie z obsluga wyjatkow
        try {
            taskPlannerService.addUser(user1);
            taskPlannerService.addTaskToUser(user1.getUserId(), task1);

            User foundUser = taskPlannerService.getUser(2);
            Task foundTask = taskPlannerService.getUser(1).getTasks().get(0);
        } catch (UserNotFoundException er) {
            System.err.println("UserNotFoundException occurred: " + er.getMessage());
        } catch (TaskNotFoundException e) {
            System.err.println("TaskNotFoundException occurred: " + e.getMessage());
        }
    }


    // Wyswietlenie wynikow na konsoli za pomoca displayResults
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

    // Walidacja userId
    private static void validateUserId(int userId) {
        if (userId <= 0) {
            throw new IllegalArgumentException("Invalid userId: " + userId);
        }
    }

    // Walidacja taskId
    private static void validateTaskId(int taskId) {
        if (taskId <= 0) {
            throw new IllegalArgumentException("Invalid taskId: " + taskId);
        }
    }

}