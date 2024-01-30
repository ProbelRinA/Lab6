package Interface;

public class MyClass implements MyInterface
{

    @Override
    public void Method()
    {
        System.out.println("Implementation od Method");
    }

    void ClassMethod()
    {
        System.out.println("Specific method of MyClass");
    }
}
