package solidprinciples.interfacesegregation;

public class Manager implements IManager {

    @Override
    public void salary() {
        System.out.println("Printing Salary");
    }

    @Override
    public void hire() {
        System.out.println("Hiring Associates");
    }

    @Override
    public void train() {
       System.out.println("Traingin Associates");
    }

    @Override
    public void addBonus() {
        System.out.println("Giving Bonus");
    }
    
}
