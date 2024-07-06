package creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        FactoryMethod abstractFactory = AbstractFactory.getFactoryMethod("Electric");
        abstractFactory.getCar("Ford").assemble();;
    }
    
}
