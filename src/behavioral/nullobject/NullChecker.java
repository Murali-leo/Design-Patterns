package nullobject;

public class NullChecker implements AbstractFactory{

    @Override
    public boolean isNull() {
       return true;
    }

    @Override
    public String get() {
       return "The Locations doesn't exist";
    }
    
}
