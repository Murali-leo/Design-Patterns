package nullobject;

public class LocationValidator {
    private DataBase dataBase;

    public LocationValidator(){
        dataBase = new DataBase();
    }

    public AbstractFactory getLocation(String name){
        if(dataBase.isExist(name)){
            return new LocationChecker(name);
        }
        return new NullChecker();
    }
}
