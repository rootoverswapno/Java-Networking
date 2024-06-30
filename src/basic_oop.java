 class Employe{
    int id;
    String name;
    public void printdetails()
    {
        System.out.println("My id is"+id);
        System.out.println("My name is "+name);
    }
 }
 class Employe1{
    int id;
    float salary;
    String name;
    void setData()
    {
        
    }
 }
public class basic_oop {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employe swapno=new Employe();//instating a new Employe object
        //setting
        swapno.id=12;
        swapno.name="swapno is the king";
//        System.out.println(swapno.id);
//        System.out.println(swapno.name);
        swapno.printdetails();
        Employe1 E=new Employe1();

  }
}
