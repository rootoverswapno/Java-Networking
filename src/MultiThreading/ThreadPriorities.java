package MultiThreading;
class Myther1 extends Thread{
    public Myther1(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i=0;
        while(i<=10000)
        {
            System.out.println("Thank You "+ this.getName());
            i++;
        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
Myther1 t1=new Myther1("swapno 1");
Myther1 t2=new Myther1("swapno 2");
Myther1 t3=new Myther1("swapno 3");
Myther1 t4=new Myther1("swapno 4");
Myther1 t5=new Myther1("swapno 5 (Most inportant)");
t5.setPriority(Thread.MAX_PRIORITY);
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.MIN_PRIORITY);
t3.setPriority(Thread.MIN_PRIORITY);
t4.setPriority(Thread.MIN_PRIORITY);
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();

    }
}
