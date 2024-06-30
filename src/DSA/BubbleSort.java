package DSA;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
       int[]vec=new int[n];
       for(int i=0;i<n;++i)
       {
           vec[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n-i-1;j++)
           {
               if(vec[j]>vec[j+1])
               {
                   int temp=vec[j];
                   vec[j]=vec[j+1];
                   vec[j+1]=temp;
               }
           }
       }

       for(int i=0;i<n;++i)
       {
           System.out.print(vec[i]+" ");
       }
    }
}
