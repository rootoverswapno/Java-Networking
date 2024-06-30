package NitunSirLab;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running with priority: " + Thread.currentThread().getPriority());
    }
}
public class Problem_19 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.setPriority(Thread.MIN_PRIORITY); // Minimum priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Maximum priority
        thread1.start();
        thread2.start();
    }
}
