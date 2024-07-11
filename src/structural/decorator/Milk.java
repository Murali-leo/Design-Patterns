package structural.decorator;

public class Milk extends BeverageDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 30;
    }

    @Override
    public String description() {
        return beverage.description() + "milk ";
    }
    
}
