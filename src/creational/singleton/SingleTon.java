package creational.singleton;
/*
 * It creates only one instance of its kind exists.
 * It Provides a Single point of access to it.
 */
public class SingleTon {
    public static void main(String[] args) {
        DataBaseConnection dataBaseConnection1 = DataBaseConnection.getInstance();
        DataBaseConnection dataBaseConnection2 = DataBaseConnection.getInstance();
        if(dataBaseConnection1 == dataBaseConnection2){
            System.out.println("Satisfying Singleton using Synchronized method");
        }
        else{
            System.out.println("Not Satisfying single ton using Synchronized method");
        }

        DataBase d1 = DataBase.INSTANCE;
        DataBase d2 = DataBase.INSTANCE;
        if(d1 == d2){
            System.out.println("Satisfying SingleTon using Enum");
        }
        else{
            System.out.println("Not Satisfying SingleTon using Enum");
        }

    }
}
