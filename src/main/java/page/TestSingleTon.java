package page;
public class TestSingleTon {
    public static void main(String[] args) {
        SingleTonExample obj1=SingleTonExample.getInstance();
        SingleTonExample obj2=SingleTonExample.getInstance();
    }
}

class SingleTonExample
{
    private static SingleTonExample instance;
    private SingleTonExample()
    {
    }
    public static SingleTonExample getInstance()
    {
        if (instance == null)
        {
            System.out.println("Created a new Object..");
            instance = new SingleTonExample();
        }
        System.out.println("Return existing object..");
        return instance;
    }
}
