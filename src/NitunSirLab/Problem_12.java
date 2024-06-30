package NitunSirLab;

import java.util.Scanner;

class EvenOdd{
    private int num;

    public void setNum(int n) {
        this.num = n;
    }

    public void evenodd()
    {
        if(num%2==0)
        {
            System.out.println(" even number "+num);
        }
        else
        {
            System.out.println(" odd number "+num);
        }
    }
}
public class Problem_12 {
    public static void main(String[] args) {
        EvenOdd swapno=new EvenOdd();
        Scanner sc=new Scanner(System.in);
        int nbr=sc.nextInt();
        swapno.setNum(nbr);
        swapno.evenodd();
    }
}
