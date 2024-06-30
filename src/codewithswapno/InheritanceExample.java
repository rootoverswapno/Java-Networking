package codewithswapno;

import java.util.Scanner;

class emp{
    int salary;
    Scanner sc=new Scanner(System.in);

    public void Sal() {
        salary=sc.nextInt();
    }
}
class Engineer extends emp{
    int bonus;

    public void  Bon() {
//        Scanner s=new Scanner(System.in);
        bonus=sc.nextInt();
    }

    void display()
    {
        System.out.println("total salary :"+(salary+bonus));
    }
}
public class InheritanceExample {
    public static void main(String[] args) {

        Engineer en=new Engineer();
        en.Sal();
        en.Bon();
        en.display();
    }
}