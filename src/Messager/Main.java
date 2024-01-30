package Messager;

public class Main
{
    public static void main(String[] args)
    {
        Message message = new Message() {
            @Override
            public void display(String message)
            {
                System.out.println("Message: " + message);
            }
        };

        message.display("First message");
        message.display("Second message");
        message.display("Third message");
    }
}
