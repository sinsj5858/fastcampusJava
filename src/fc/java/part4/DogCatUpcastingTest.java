package fc.java.part4;

import fc.java.part4.model.Animal;
import fc.java.part4.model.Cat;
import fc.java.part4.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal = new Cat();
        animal.eat();

        ((Cat)animal).night();  //1
        Cat cat = (Cat) animal;//2
        cat.eat();
    }
}
