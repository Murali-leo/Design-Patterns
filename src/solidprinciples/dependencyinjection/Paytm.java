package solidprinciples.dependencyinjection;

// Low level Components
public class Paytm implements Transactions{

    @Override
    public void pay() {
       System.out.println("Paying via Paytm");
    }
    
}
