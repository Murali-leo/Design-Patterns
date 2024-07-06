package creational.factorymethod;

public class Factory {
 public static void main(String[] args) {
    AnimalEat animalEat = AnimalFactory.getAnimal(Animal.LION);
    animalEat.eat();
 }   
}
