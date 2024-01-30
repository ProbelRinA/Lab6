package Interface;

import java.lang.reflect.Method;

public class Main
{
    public static void main(String[] args)
    {
        MyClass object1 = new MyClass();
        object1.ClassMethod();
        object1.Method();

        MyInterface object2 = new MyInterface() {
            @Override
            public void Method()
            {
                System.out.println("Implementation of Method in anonymous object");
            }
        };

        object2.Method();

        new MyInterface()
        {
            @Override
            public void Method()
            {
                System.out.println("Implementation of Method in anonymous class");
            }
        };
    }
}


