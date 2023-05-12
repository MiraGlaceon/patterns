package mira.space.singleton;

public class DatabaseSingleton {

    private String connection = "Not connected";
    private static DatabaseSingleton instance;

    private DatabaseSingleton() {
    }

    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseSingleton();
        }

        return instance;
    }

    public void connect() {
        this.connection = "Connected";
    }

    public String isConnected() {
        return connection;
    }
}
