package fc.java.part4;

import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;

public class IsNotOverride {
    public static void main(String[] args) {
        // 재정의를 하지 않았기 때문에 -> eat명령어가 오작동
        // 다형성 보당하지 않음 -> 다형성을 보장하려면?(재정의를 강제로 하도록 만들어야함
        Animal animal = new Dog();
        animal.eat();

        animal = new Cat();
        animal.eat();

        animal.move();
    }
}
