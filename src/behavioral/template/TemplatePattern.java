package template;

public abstract class TemplatePattern {

    public abstract void initializeGame();
    public abstract void playing();
    public abstract void showResults();

    public final void play(){
        initializeGame();
        playing();
        showResults();
    }
    
}
