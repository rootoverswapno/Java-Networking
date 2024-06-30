package smartbeans;
class Employe
{
    int id;
    double salary;
    String name;

    public void prindetails()
    {
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public double returnsalary()
    {
        return salary;
    }
}
public class Basic1_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custor class");
        Employe swapno=new Employe();
        Employe ashik=new Employe();
        //instantiating a new employe object
        swapno.id=12;
        swapno.salary=12000;
        swapno.name="codewithswapno";
        ashik.id=75;
        ashik.salary=15000;
        ashik.name="bokacoda ashik";

        swapno.prindetails();
        ashik.prindetails();
        double salary=swapno.returnsalary();
        System.out.println("Swapno salary is: "+salary);
//        System.out.println(salary);
        double salary1= ashik.returnsalary();
        System.out.println("Ashik salary is :"+salary1);
//        System.out.println(salary1);

//        System.out.println(swapno.id);
//        System.out.println(swapno.name);
    }
}
