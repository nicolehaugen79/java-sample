public class HelloWorldLib {
   
    public void Method1()
    {
        //TODO: ToDo causes sonar violation
    }

    public String Method2()
    {
         //Unused variable causes sonar violation
        int v = 1;

        return "hello world";
    }

    public boolean Method3()
    {
        int a = 3;
        int b = 4;

        //Reversed ops causes sonar violation
        a =+ b;

        //TODO: ToDo causes sonar violation

        //Double equals causes sonar violation
        if (a == b)
        {
            return true;
        }

        return false;
    }

    public void Method4()
    {
        int a = 3;
        int b = 4;

        //Reversed ops causes sonar violation
        a =+ b;
    }
}