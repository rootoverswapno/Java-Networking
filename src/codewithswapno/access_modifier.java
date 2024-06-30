package codewithswapno;
import java.util.Scanner;
class Employe{
    private int id;
    private String name;
    public void setId(int n)
    {
        this.id=n;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class access_modifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name_n=sc.nextLine();
        int id_nbr=sc.nextInt();

        Employe swapno=new Employe();
        swapno.setId(id_nbr);
        swapno.setName(name_n);
        System.out.println(swapno.getId());
        System.out.println(swapno.getName());
    }
}
