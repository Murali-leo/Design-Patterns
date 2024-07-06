package creational.singleton;

public enum DataBase {
    INSTANCE;
    public void connect(){
        System.out.println("Connecting to the database using Enum");
    }

    public void disconnect(){
        System.out.println("Disconnecting to the database using Enum");
    }
}
