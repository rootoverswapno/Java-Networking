package NitunSirLab;
class Student{
    int roll;
    String name;
    Student()
    {
        roll=0;
        name=" ";

    }
    Student(int x,String y)

    {
        roll=x;
        name=y;

    }

    public void setName(int roll,String name) {
        this.roll=roll;
        this.name = name;
    }
    public void display()
    {
        System.out.println("Roll : "+roll);
        System.out.println("Name : "+name);
    }
}
public class Problem_14 {
    public static void main(String[] args) {
     Student st=new Student();
     Student st1=new Student(120,"swapno");
     st.display();
     st1.display();
     st1.setName(12,"polash");
     st1.display();

    }
}
