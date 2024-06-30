package oopjava;
 abstract class parent{
    public parent() {
        System.out.println("my name is base class constructor");
    }
    public void sayHello()
    {
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void myself();
}
class child extends parent
{
    @Override
    public void greet() {
        System.out.println("Good mornuing");
    }

    @Override
    public void myself() {
        System.out.println("My name is swapnomoy Biswas");
    }
}
public class cws_Abstract {
    public static void main(String[] args) {
         child ch=new child();
         ch.greet();
         ch.myself();
         ch.sayHello();
    }
}
