package DSA;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n=sc.nextInt();
        int[]vec=new int[n];
        for(int i=0;i<vec.length;++i)
        {
            vec[i]=sc.nextInt();
        }
         int min_index;
        for(int i=0;i<n-1;++i)
        {
            min_index=i;
            for(int j=i+1;j<n;++j)
            {
                if(vec[j]<vec[min_index])
                {
                    min_index=j;
                }
            }
            if(min_index!=i)
            {
                int temp=vec[min_index];
                vec[min_index]=vec[i];
                vec[i]=temp;

            }
        }
        for(int i:vec)
        {
            System.out.print(i+" ");
        }
    }
}
