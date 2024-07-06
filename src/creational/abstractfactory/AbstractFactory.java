package creational.abstractfactory;

public class AbstractFactory {

    public static FactoryMethod getFactoryMethod(String factory) {
        if(factory.equalsIgnoreCase("Electric"))
            return new ElectricCarFactory();
        else if(factory.equalsIgnoreCase("Petrol"))
            return new PetrolCarFactory();
        return null;
    }

}
