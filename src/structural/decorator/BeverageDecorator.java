package structural.decorator;

public abstract class BeverageDecorator implements Beverage {

    protected Beverage beverage;
    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return this.beverage.cost();
    }

    @Override
    public String description() {
        return this.beverage.description();
    }
    
}
