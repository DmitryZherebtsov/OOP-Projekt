import java.util.HashMap;
import java.util.Map;

// Implementacja interfejsu User.UserRepository przy użyciu wersji przechowującej użytkowników w pamięci
public class InMemoryUserRepository implements User.UserRepository {
    // Mapa przechowująca użytkowników, gdzie kluczem jest identyfikator użytkownika (userId), a wartością jest obiekt User
    private final Map<Integer, User> users;

    // Konstruktor inicjalizujący mapę
    public InMemoryUserRepository() {
        this.users = new HashMap<>();
    }

    // Metoda do zapisywania użytkownika do repozytorium
    @Override
    public void saveUser(User user) {
        users.put(user.getUserId(), user);
    }

    // Metoda do pobierania użytkownika z repozytorium na podstawie identyfikatora użytkownika (userId)
    @Override
    public User getUser(int userId) {
        return users.get(userId);
    }

    // Metoda do usuwania użytkownika z repozytorium
    @Override
    public void removeUser(int userId) {
        users.remove(userId);
    }
}
