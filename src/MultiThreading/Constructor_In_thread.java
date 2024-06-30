package MultiThreading;
class Mythr extends Thread{

    public Mythr(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i=4;
        System.out.println("I am a thread ");
//        while ()
//        {
//            System.out.println("I am a thread ");
//        }
    }
}
class Mythr1 extends Thread{

    public Mythr1(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i=4;
        System.out.println("I am a thread  2 ");
//        while ()
//        {
//            System.out.println("I am a thread ");
//        }
    }
}
public class Constructor_In_thread {
    public static void main(String[] args) {
         Mythr t=new Mythr("swapno");
         t.start();
        System.out.println("The id of the thread is "+t.getId());
        System.out.println("The name of the thread is "+t.getName());
    }
}
