package creational.abstractfactory;

public class PetrolCarFactory implements FactoryMethod {

    @Override
    public Car getCar(String name) {
        if(name.equalsIgnoreCase("Ford"))
            return new PetrolFord();
        else if(name.equalsIgnoreCase("Audi"))
            return new PetrolAudi();
        return null;
    }
    
}
