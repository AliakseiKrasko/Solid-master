public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        user.report();

        Persister persister = new Persister();
        persister.save(user);
    }
}
