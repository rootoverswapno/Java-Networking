package codewithswapno;

import java.util.Scanner;

class employe {
    int salary = 120;

}

class derived1 extends employe {
    int bonus;
    Scanner s = new Scanner(System.in);

    void setBonus() {
        bonus = s.nextInt();
    }

    void print() {
        System.out.println(salary);
        System.out.println(bonus);
        s.close(); // Close the Scanner object
    }

}

public class inheritancepp2 {
    public static void main(String[] args) {
        System.out.println("hello swapno");
        derived1 d = new derived1();
        d.setBonus();
        d.print();

    }
}
