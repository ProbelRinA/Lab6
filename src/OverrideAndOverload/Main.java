package OverrideAndOverload;
public class Main {
    public static void main(String[] args)
    {
        Animal animal1 = new Animal();
        animal1.makeSound();
        animal1.eat();

        Animal animal2 = new Dog();
        animal2.makeSound();
        animal2.eat();

        Dog dog = (Dog) animal2;
        dog.eat("Bone");
    }
}