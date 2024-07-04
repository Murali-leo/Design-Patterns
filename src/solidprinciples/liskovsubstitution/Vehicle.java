package solidprinciples.liskovsubstitution;

public abstract class Vehicle {
     private String name;
     private int uniqueId;

    public Vehicle(String name, int uniqueId) {
        this.name = name;
        this.uniqueId = uniqueId;
    }

    public void speedUp(){
        System.out.println("Vehicel speed UP");
    }
     
    public void speedDown(){
        System.out.println("Vehicel speed Down");
    }

    public abstract void fuel();
}
