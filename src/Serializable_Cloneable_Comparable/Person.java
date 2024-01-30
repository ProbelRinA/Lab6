package Serializable_Cloneable_Comparable;

import java.io.Serializable;

public class Person implements Serializable
{
    private static final long serialUID = 1L;
    private String name;
    private int age;

    public Person (String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static long getSerialUID() {
        return serialUID;
    }

    @Override
    public String toString()
    {
        return "Preson\n Name: " + name + "\nAge: " + age;
    }
}
