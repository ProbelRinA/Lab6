package Calculator;

public class Calculator
{
    public int add(int a, int b)
    {
        return  a + b;
    }

    public double add(double a, double b)
    {
        return a + b;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

    public double subtract(double a, double b)
    {
        return a - b;
    }

    public int multiply(int a, int b)
    {
        return a * b;
    }

    public double multiply(double a, double b)
    {
        return a * b;
    }

    public double divide(int a, int b)
    {
         if (b != 0)
         {
             return (double) a / b;
         } else
         {
             throw new ArithmeticException("Cannot divide by zero");
         }
    }

    public double divide(double a, double b)
    {
        if (b != 0.0)
        {
            return a / b;
        } else
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public double power(int base, int exponent)
    {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();

        System.out.println("Addition (int): " + calculator.add(5, 3));
        System.out.println("Addition (double): " + calculator.add(5.5, 3.3));

        System.out.println("Subtraction (int): " + calculator.subtract(8, 3));
        System.out.println("Subtraction (double): " + calculator.subtract(8.5, 3.2));

        System.out.println("Multiplication (int): " + calculator.multiply(4, 5));
        System.out.println("Multiplication (double): " + calculator.multiply(4.2, 5.5));

        System.out.println("Division (int): " + calculator.divide(10, 2));
        System.out.println("Division (double): " + calculator.divide(10.0, 2.0));

        System.out.println("Power: " + calculator.power(2, 3));
    }
}
