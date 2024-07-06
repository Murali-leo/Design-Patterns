package solidprinciples.liskovsubstitution;

public class EcoCar extends Vehicle {

    public EcoCar(String name, int uniqueId) {
        super(name, uniqueId);
    }

    @Override
    public void speedUp(){
        System.out.println("EcoCar Speed UP");
    }
    @Override
    public void speedDown(){
        System.out.println("EcoCar speed Down");
    }

    @Override
    public void fuel() {
        System.out.println("Eco runs with Eco friendly Gases");
    }
    
}
