package smartbeans;
import java.util.Scanner;
public class mergetwoarray {
    public static double find(int[]m1,int[]m2)
    {
        int len=m1.length+m2.length;
        int[]merge=new int[len];
        int i=0;
        int j=0;
        int k=0;
        while (i<m1.length&&j<m2.length)
        {
            if(m1[i]<m2[j])
            {
                merge[k]=m1[i];
                i++;
                k++;

            }
            else
            {
                merge[k]=m2[j];
                j++;
                k++;
            }
        }
        while (i<m1.length)
        {
            merge[k]=m1[i];
            i++;
            k++;
        }
        while (j<m2.length)
        {
            merge[k]=m2[j];
            j++;
            k++;
        }

//       for(int p=0;p<len;++p)
//       {
//           System.out.println(merge[p]);
//       }
      double medium;
       int mid=merge.length/2;
       if(merge.length%2==1)
       {
           medium=merge[mid];
       }
       else
       {
           medium=(merge[mid]+merge[mid-1])/2.00;
       }
       return medium;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]arr=new int[a];
        for(int i=0;i<a;++i)
        {
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int []arr1=new int[b];
        for(int i=0;i<b;++i)
        {
            arr1[i]=sc.nextInt();
        }
        double medi=find(arr,arr1);
        System.out.println(medi);
    }
}
