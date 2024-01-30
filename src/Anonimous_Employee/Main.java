package Anonimous_Employee;

public class Main
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Rick", "Doe", "Engineer")
        {
            private  int salary = 4000;

            public int getSalary() {
                return salary;
            }

            @Override
            public String toString()
            {
                return super.toString() + "\nSalary: " + salary;
            }
        };

        System.out.println(employee1);
    }
}
