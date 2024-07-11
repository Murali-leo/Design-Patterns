package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Sugar(new Milk(new PlainBeverage()));
        System.out.println(beverage.cost());
        System.out.println(beverage.description());
    }
}
