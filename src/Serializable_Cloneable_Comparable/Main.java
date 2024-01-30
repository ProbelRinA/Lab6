package Serializable_Cloneable_Comparable;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person("John", 34);

        Car car = new Car("Toyota", 2022);
        try
        {
            Car clonedCar = (Car) car.clone();
            System.out.println("Cloned car: " + clonedCar);
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        Book book1 = new Book("ABC", "Lira Stone");
        Book book2 = new Book("CDF", "Aria John");

        if (book1.compareTo(book2) < 0)
        {
            System.out.println(book1 + "\nComes before: " + book2);
        } else if (book1.compareTo(book2) > 0)
        {
            System.out.println(book1 + "\nComes after: " + book2);
        } else
        {
            System.out.println(book1 + "\bIs equal to: " + book2);
        }
    }
}
