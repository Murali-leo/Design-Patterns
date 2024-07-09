package template;

public class BasketBall extends TemplatePattern{

    @Override
    public void initializeGame() {
       System.out.println("Initializing BasketBall");
    }

    @Override
    public void playing() {
        System.out.println("BasketBall Playing..");
    }

    @Override
    public void showResults() {
        System.out.println("BasketBall REsults...");
    }
    
}
