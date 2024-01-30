package PrintRightInfo;

public class Student extends Person
{
    private int year;

    public Student(String name, String surname, int year)
    {
        super(name, surname);
        this.year=year;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nOccupation: Student" + "\nStudy year: " + year;
    }
}
