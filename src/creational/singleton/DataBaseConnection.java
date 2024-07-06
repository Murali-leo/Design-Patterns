package creational;

public class DataBaseConnection {

    private static DataBaseConnection INSTANCE;

    private DataBaseConnection(){
    }

    public static DataBaseConnection getInstance(){
        if(INSTANCE == null){
        synchronized(DataBaseConnection.class){
            INSTANCE = new DataBaseConnection();
        }
    }
        return INSTANCE;
    }

    public void connect(){
        System.out.println("Connecting to the Database...");
    }

    public void disconnect(){
        System.out.println("Disconnecting the Database...");
    }
    
}
