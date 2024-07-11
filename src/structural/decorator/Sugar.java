package structural.decorator;

public class Sugar extends BeverageDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 20;
    }

    @Override
    public String description() {
        return beverage.description() + "sugar ";
    }
    
}
