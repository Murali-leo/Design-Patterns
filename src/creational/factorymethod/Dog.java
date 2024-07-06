package creational.factorymethod;

public class Dog implements AnimalEat{

    @Override
    public void eat() {
       System.out.println("Dog is Eating");
    }
    
}
