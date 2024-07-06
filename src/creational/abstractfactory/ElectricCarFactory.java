package creational.abstractfactory;

public class ElectricCarFactory implements  FactoryMethod{

    @Override
    public Car getCar(String name) {
        if(name.equalsIgnoreCase("Audi"))
            return new ElectricAudi();
        else if(name.equalsIgnoreCase("Ford"))
            return new ElectricFord();
        return null;
    }
    
}
