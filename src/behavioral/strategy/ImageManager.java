package strategy;

public class ImageManager {
    
    private StrategyPattern strategyPattern;
    
    public void setRenderer(StrategyPattern strategyPattern){
        this.strategyPattern = strategyPattern;
    }

    public void show(){
        this.strategyPattern.show();
    }
}
