package solidprinciples.interfacesegregation;

public class Employee implements IEmployee {

    @Override
    public void salary() {
       System.out.println("Printing salary");
    }
    
}
