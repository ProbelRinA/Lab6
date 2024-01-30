package PrintRightInfo;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person("Alice", "Harsher");
        Student student = new Student("Nikka", "Olive", 4);

        System.out.println(person.toString());
        System.out.println();
        System.out.println(student.toString());
    }
}
