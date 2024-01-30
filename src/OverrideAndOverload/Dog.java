package OverrideAndOverload;

public class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Dog barks.");
    }

    void eat(String food)
    {
        System.out.println("Dog eats " + food + ".");
    }
}
