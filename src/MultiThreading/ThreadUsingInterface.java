package MultiThreading;
class MuthreadRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");
        System.out.println("I am a thread 1 not a thread 1");

    }
}
class MuthreadRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
        System.out.println("I am a thread 2 not a thread 2");
    }
}
public class ThreadUsingInterface {
    public static void main(String[] args) {
     MuthreadRunnable1 t11=new MuthreadRunnable1();
     Thread t1 =new Thread(t11);
     MuthreadRunnable2 t22=new MuthreadRunnable2();
         Thread t2 =new Thread(t22);
         t1.start();
         t2.start();
    }
}
