package solidprinciples.liskovsubstitution;

public class Car extends Vehicle {

    public Car(String name, int uniqueId) {
        super(name, uniqueId);
    }

    @Override
    public void speedUp(){
        System.out.println("Car Speed UP");
    }
    @Override
    public void speedDown(){
        System.out.println("Car speed Down");
    }

    @Override
    public void fuel() {
       System.out.println("Car runs with fuel");
    }
    
}
