package codewithswapno;
class Base1{
    int x;
    Base1()
    {
        System.out.println("I am a constructor ");
    }
    Base1(int x)
    {
        System.out.println("I am Base class Constructor with arguments "+x);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
class Derived2 extends Base1{
    int y;
    Derived2()
    {
        System.out.println("I am a derived class constructor");
    }
    Derived2(int x,int y)
    {
        super(x);
        System.out.println("I am a derived class constructor with 2 arguments "+y);
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
class chieldOFderived extends Derived2{
    int z;
    chieldOFderived()
    {

        System.out.println("I am a ChieldOfDerived Class constructor ");
    }
    chieldOFderived(int x,int y,int z)
    {
   super(x,y);
        System.out.println("I am a ChieldOfDerived Class constructor with 3 arguments "+z);
    }
}
public class cws_46 {
    public static void main(String[] args) {
//  Base1 b=new Base1();
//  chieldOFderived ss=new chieldOFderived();
  chieldOFderived c=new chieldOFderived(2,3,5);
    }
}
