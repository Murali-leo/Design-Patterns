package solidprinciples.dependencyinjection;

// Low level Components
public class PhonePay  implements Transactions{

    @Override
    public void pay() {
       System.out.println("Paying via PhonePay");
    }
    
}
