package Orders;

public class Service implements Order
{
    private String name;
    private double hourlyRate;
    private int hours;

    public Service(String name, double hourlyRate, int hours)
    {
        this.name=name;
        this.hourlyRate=hourlyRate;
        this.hours=hours;
    }

    @Override
    public double calculatePrice()
    {
        return hourlyRate * hours;
    }

    @Override
    public void printInfo()
    {
        System.out.println("Service: " + name);
        System.out.println("Hours: " + hours);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total: Price: $" + calculatePrice());
    }
}
