package DSA;

import java.util.Scanner;

public class practice_1 {
    public static void main(String[] args) {
        //string in lowercase
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number under 7 : ");
        int n= sc.nextInt();
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n+1;++j)
            {
                if((i==0)&&(j%3!=0)||(i==1)&&(j%3)==0||(i-j)==2||(i+j)==8)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }
    }
}
