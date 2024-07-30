public class Persister implements Savable {
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
