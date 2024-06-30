package MultiThreading;
class Mythread1 extends Thread{
    public void run()
    {
        int i=0;
        while(i<10000){
            System.out.println("Thread 1 is Good ");
            System.out.println("Swapno king of the world");
            i++;
        }

    }
}
class Mythread2 extends Thread{
    @Override
    public void run()
    {
        int i=0;
        while(i<10000)
        {
            System.out.println("Thread 2 is not Good ");
            System.out.println("I am sad");
            i++;
        }

    }
}
public class threading {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();
         t1.start();
         t2.start();
    }
}
