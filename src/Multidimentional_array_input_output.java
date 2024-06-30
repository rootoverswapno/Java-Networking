import java.util.Scanner;
public class Multidimentional_array_input_output {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Row of array : ");
        int row=s.nextInt();
        System.out.print("Enter Coloum of array : ");
        int col=s.nextInt();
        int a[][]=new int[row][col];
        for(int i=0;i<row;++i)
        {
            for(int j=0;j<col;++j)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.print("Enter Row of array : ");
        int row1=s.nextInt();
        System.out.print("Enter Coloum of array : ");
        int col1=s.nextInt();
        int b[][]=new int[row][col];
        for(int i=0;i<row1;++i)
        {
            for(int j=0;j<col1;++j)
            {
                b[i][j]=s.nextInt();
            }
        }
       System.out.println("Sum of multidimentional array : ");
        int c[][]=new int[row][col];
        for(int i=0;i<row;++i)
        {
            for(int j=0;j<col;++j)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

        }
    }
}
