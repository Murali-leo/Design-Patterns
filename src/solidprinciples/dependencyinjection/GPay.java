package solidprinciples.dependencyinjection;

// Low level Components
public class GPay implements Transactions {

    @Override
    public void pay() {
       System.out.println("Paying via Gpay");
    }
    
}
