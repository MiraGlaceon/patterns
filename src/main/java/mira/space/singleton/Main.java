package mira.space.singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseSingleton databaseInstance = DatabaseSingleton.getInstance();
        databaseInstance.connect();
        DatabaseSingleton databaseInstance2 = DatabaseSingleton.getInstance();
        System.out.println(databaseInstance2.isConnected());
    }
}
