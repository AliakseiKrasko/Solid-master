import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class UserSorter {
    public List<User> sortByName(List<User> users) {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getName().compareTo(u2.getName());
            }
        });
        return users;
    }
}
