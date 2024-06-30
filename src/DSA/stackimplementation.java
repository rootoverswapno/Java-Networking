package DSA;

import java.util.Scanner;

public class stackimplementation {
    static final int MAX=1000;
    static int[]stackarr=new int[MAX];
    static int top=-1;
    static void push(int data)
    {
        if(top==MAX-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            stackarr[++top]=data;
        }
    }
    static int pop()
    {
        int value;
        if(top==-1)
        {
            System.out.println("Stack underflow ");
            return -1;
        }
        else
        {
          value=stackarr[top--];
          return value;
        }
    }
    static void print()

    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Stack is : ");
            for(int i=top;i>=0;--i)
            {
                System.out.println(stackarr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        while (true)
        {
            System.out.println("choose under a choice : ");

            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.println("Select Yor choice : ");
            ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    int x;
                    System.out.print("Ennter a push value : ");
                    x=sc.nextInt();
                    push(x);
                    print();
                    break;
                case 2:
                    int receive;
                    receive=pop();
                    if(receive!=-1)
                        System.out.println("Pop Element is : "+receive);
                    print();
                    break;
            }
        }
    }
}
