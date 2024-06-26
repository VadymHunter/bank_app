public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        save();
    }

    @Override
    public void select() {
        load();
    }

    @Override
    public void remove() {
        delete();
    }
}
