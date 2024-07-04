package solidprinciples.liskovsubstitution;
/*
 * LiskovSubstitution.java
 * 
 * Objects of superclass shall be replaceable with objects of its subclass without breaking the application. 
 */
public class LiskovSubstituion {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("BMW",9999);
        vehicle1.speedDown();
        EcoCar vehicle2 = new EcoCar("Rolls Royce",0000);
        vehicle2.speedUp();
    }
}
