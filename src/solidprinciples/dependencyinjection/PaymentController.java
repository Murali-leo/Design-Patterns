package solidprinciples.dependencyinjection;

//Abstractin level
public class PaymentController {

    private Transactions transactions;
    
    public void setUpPayment(Transactions transactions){
        this.transactions = transactions;
    }

    public void pay(){
        this.transactions.pay();
    }
}
