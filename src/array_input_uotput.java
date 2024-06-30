import java.util.Scanner;
public class array_input_uotput {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
      int n;
        System.out.println("Enter size of array : ");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;++i)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Output of array Elements : ");
        for(int i=0;i<n;++i)
        {
            System.out.println(a[i]);
        }


    }
}
