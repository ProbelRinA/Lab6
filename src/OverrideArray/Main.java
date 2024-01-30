package OverrideArray;

public class Main
{
    public static void main(String[] args)
    {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal();
        animals[3] = new Dog();
        animals[4] = new Cat();

        for (Animal animal : animals)
        {
            animal.makeSound();
        }
    }
}
