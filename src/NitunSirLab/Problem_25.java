package NitunSirLab;
interface Interface1{
    void method1();
}
interface Interface2{
    void method2();
}
class Myclass implements Interface1,Interface2{
    @Override
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("method 2 implementation");
    }
}
public class Problem_25 {
    public static void main(String[] args) {
      Myclass sm=new Myclass();
      sm.method1();
      sm.method2();
    }
}
