package creational.factorymethod;

public class AnimalFactory {
    public static AnimalEat getAnimal(Animal animal){
        if(animal.equals(Animal.LION))
            return new Lion();
        else if(animal.equals(Animal.DOG))
            return new Dog();
        else if(animal.equals(Animal.TIGER))
            return new Tiger();
        return null;
    }
}
