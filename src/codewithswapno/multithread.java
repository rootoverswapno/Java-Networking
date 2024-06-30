package codewithswapno;
class Multithread1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<1000)
        {
            System.out.println("Swapno king of the world ");
            i++;
        }
    }
}
class Multithread2 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<1000)
        {
            System.out.println("Polash king of the world ");
            i++;
        }
    }
}

public class multithread {
    public static void main(String[] args) {
        Multithread1 t1=new Multithread1();
        Multithread2 t2=new Multithread2();
        Thread tt=new Thread(t1);
        Thread ttt=new Thread(t2);
        tt.start();
        ttt.start();

    }
}
