package smartbeans;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1 for pistol 2 for sessior 3 for knife");
            int userInput=sc.nextInt();
            Random random=new Random();
            int computerInput=random.nextInt(3);
            if(userInput==computerInput)
            {
                System.out.println("DRaw");
            } else if (userInput == 1 && computerInput == 2 || userInput == 2 && computerInput == 3 || userInput == 3&&computerInput==1) {
                System.out.println("You winn.....");
            }
            else
            {
                System.out.println("COmputer win......");
            }
        }

    }
}
