package nullobject;

public class Main {
    public static void main(String[] args) {
        LocationValidator locationValidator = new LocationValidator();
        System.out.println(locationValidator.getLocation("").get());
    }
    
}
