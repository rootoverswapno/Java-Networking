package NitunSirLab;

public class Problem_11 {
    private int number;
    private String str;
     public Problem_11()
     {
         number=0;
         str="Default";
     }

    public Problem_11(int number,String str) {
        this.number = number;
        this.str=str;
    }
    public void display()
    {
        System.out.println("My number :"+number);
        System.out.println("My string :xx"+str);

    }
    public static void main(String[] args) {
         Problem_11 obj1=new Problem_11();
         obj1.display();
         Problem_11 obj2=new Problem_11(4,"swapno");
         obj2.display();

    }
}
