package smartbeans;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        int day=7;
        String Day;
        switch (day)
        {
            case 1:
                Day="Monday";
                break;
            case 2:
                Day="Tuesday";
                break;
            case 3:
                Day="Wednesday";
                break;
            case 4:
                Day="Thursday";
                break;
            case 5:
                Day="Friday";
                break;
            case 6:
                Day="saturday";
                break;
            default:
                Day="Invalid Day";
        }
        System.out.println(Day);
    }
}
