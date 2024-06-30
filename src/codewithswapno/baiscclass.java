package codewithswapno;
class Employeee{
 private int id;
 private String name;
 public void setId(int n)
 {
     id=n;
 }
 public void setName(String s)
 {
     name=s;
 }
 public int getId()
 {
     return id;
 }
 public String getName()
 {
     return name;
 }
}
public class baiscclass {
    public static void main(String[] args) {
  Employeee S=new Employeee();
        S.setId(5);
        S.setName("swapno");
        System.out.println(S.getId());
        System.out.println(S.getName());
    }
}
