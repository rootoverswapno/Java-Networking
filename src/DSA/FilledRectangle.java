package DSA;

import java.util.Scanner;

public class FilledRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println();
        for(int i=0;i<=row;++i)
        {
            for(int j=1;j<=col;++j)
            {
                if(i==1||i==row||j==1||j==col)
                {
                    System.out.println("*");
                }
                else
                {
                    System.out.println(" ");
                }
            }
//            System.out.println();
        }
    }
}
