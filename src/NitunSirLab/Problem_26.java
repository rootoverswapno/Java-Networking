package NitunSirLab;
interface Interface11{
    void method1();
}
interface Interface22{
    void method2();
}
class swapno implements Interface1,Interface2{
    @Override
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("method 2 implementation");
    }
}
public class Problem_26 {
    public static void main(String[] args) {
        Myclass sm=new Myclass();
        sm.method1();
        sm.method2();
    }
}
