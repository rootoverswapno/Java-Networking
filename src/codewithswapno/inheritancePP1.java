package codewithswapno;

import java.util.Scanner;

class Employe1{
    int salary =5000;
}
class derived extends Employe1{
    int bonus=300;

}
public class inheritancePP1 {
    public static void main(String[] args) {
       derived d=new derived();
        System.out.println(d.salary+" "+d.bonus);
    }
}
