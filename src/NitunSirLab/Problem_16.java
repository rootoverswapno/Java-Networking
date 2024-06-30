package NitunSirLab;
class Constructor{
    Constructor(String name)
    {
        System.out.println("constructor with one argument : "+name);
    }
    Constructor(String name,int age)
    {
        System.out.println("Two arguments  : "+name+" "+age);
    }
    Constructor(long id)
    {
        System.out.println("One argument "+id);
    }
}
public class Problem_16 {
    public static void main(String[] args) {
    Constructor cs=new Constructor("swapno");
    Constructor cs1=new Constructor("swapno",22);
    Constructor cs2=new Constructor(120);
    }
}
