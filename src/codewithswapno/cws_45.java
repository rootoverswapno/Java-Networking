package codewithswapno;
  class Base{
      int x;

      public void setX(int x) {
          System.out.println("I am base and setting x now");
          this.x = x;
      }
      public int getX() {
          return x;
      }
      public void printme()
      {
          System.out.println("I am a Constructor ");
      }
  }
  class Derived extends Base{
      int y;

      public int getY() {
          return y;
      }

      public void setY(int y) {
          this.y = y;
          System.out.println("I am derived and setting up derived now");
      }
  }
public class cws_45 {
    public static void main(String[] args) {
     Derived d=new Derived();
//     d.setY(5);
     d.setX(10);
//        System.out.println(d.getY());
        System.out.println(d.getX());

    }
}
