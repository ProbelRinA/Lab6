package Serializable_Cloneable_Comparable;

public class Car implements Cloneable
{
    private String model;
    private int year;

    public Car (String model, int year)
    {
        this.model=model;
        this.year=year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString()
    {
        return "Car \nModel: " + model + "\nYear: " + year;
    }
}
