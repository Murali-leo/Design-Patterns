package nullobject;

public class LocationChecker implements AbstractFactory{

    private String location;

    public LocationChecker(String location){
        this.location = location;
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String get() {
       return this.location;
    }
    
}
