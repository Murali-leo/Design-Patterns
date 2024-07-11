package structural.decorator;

public class PlainBeverage implements Beverage {

    @Override
    public int cost() {
        return 50;
    }

    @Override
    public String description() {
        return "Plain Coffee ";
    }
    
}
