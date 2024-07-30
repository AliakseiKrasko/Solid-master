public class FileManager {
    private Savable savable;
    private Loadable loadable;

    public FileManager(Savable savable, Loadable loadable) {
        this.savable = savable;
        this.loadable = loadable;
    }

    public void saveUser(User user) {
        savable.save(user);
    }

    public User loadUser() {
        return loadable.load();
    }
}
