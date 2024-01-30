package Orders;

public class Product implements Order
{
    private String name;
    private double price;
    private int quantity;

    public Product (String name, double price, int quantity)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    @Override
    public double calculatePrice()
    {
        return price * quantity;
    }

    @Override
    public void printInfo()
    {
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("Total: Price: $" + calculatePrice());
    }
}
