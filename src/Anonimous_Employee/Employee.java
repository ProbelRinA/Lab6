package Anonimous_Employee;

public class Employee
{
    private String name;
    private String surname;
    private String position;

    public Employee(String name, String surname, String position)
    {
        this.name=name;
        this.surname=surname;
        this.position=position;
    }

    @Override
    public String toString()
    {
        return "Employee info: " + "\nName: " + name + "\nSurname: " + surname + "\nPosition: " + position;
    }
}
