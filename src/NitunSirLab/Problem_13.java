package NitunSirLab;

import java.util.Scanner;

class Employe{
     private int id;
   private String name;

  public   void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
public class Problem_13 {
    public static void main(String[] args) {
       Employe swapno=new Employe();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        swapno.setName(s);
        swapno.setId(n);
        System.out.println(swapno.getName());
        System.out.println(swapno.getId());


    }
}
