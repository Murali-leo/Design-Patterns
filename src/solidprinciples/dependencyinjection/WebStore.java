package solidprinciples.dependencyinjection;


// High-Level Module
public class WebStore {

    private PaymentController paymentController;

    public WebStore(){
        paymentController = new PaymentController();
        paymentController.setUpPayment(new GPay());
    }

    public void purchaseItem(){
        this.paymentController.pay();
    }
    
}
