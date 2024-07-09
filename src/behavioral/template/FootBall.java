package template;

public class FootBall extends TemplatePattern{

    @Override
    public void initializeGame() {
       System.out.println("Initializing Football Game");
    }

    @Override
    public void playing() {
       System.out.println("Football Playing....");
    }

    @Override
    public void showResults() {
       System.out.println("Football ShowResults");
    }

    
}
