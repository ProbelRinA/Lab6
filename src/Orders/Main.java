package Orders;

public class Main
{
    public static void main(String[] args)
    {
        Order product = new Product("Laptop", 2500.0, 2);
        Order service = new Service("Computer Repair", 80.0, 5);

        System.out.println("Product order information: ");
        product.printInfo();

        System.out.println("Service order information: ");
        service.printInfo();
    }
}
