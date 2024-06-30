package codewithswapno;

import java.util.Scanner;
/*
class Employe{
    Scanner sc=new Scanner(System.in);
    int salary;
    String name;
    public void setData()
    {

        name=sc.nextLine();
        salary=sc.nextInt();
//         char s=sc.next().charAt(0);
//        sc.close();
    }
    public void getData()
    {
        System.out.println(salary);
        System.out.println(name);
    }
}
class Cellphone{
    public void ringing()
    {
        System.out.println("Ringing....");
    }
    public void caling()
    {
        System.out.println("clling....");
    }
}*/
class Area{
    Scanner sc=new Scanner(System.in);
    int side;
    public void setSide()
    {
        side=sc.nextInt();
    }
    public int area()
    {
        return (side*side);
    }
    public int para()
    {
        return 4*side;
    }
}

public class practice1 {
    public static void main(String[] args) {
       /* //problem 1
        Employe swapno=new Employe();
        swapno.setData();
        swapno.getData();
        Cellphone polash=new Cellphone();
        polash.ringing();
        polash.caling();
        */
        Area a=new Area();
        a.setSide();
        System.out.println(a.area());
        System.out.println(a.para());


    }
}
