package NitunSirLab;

public class Problem_15 {
   static    class variable{
        public int Functionoverload(int x,int y)
        {
            return x+y;
        }
        public int Functionoverload(int x,int y,int z)
        {
            return x+y+z;
        }
        public double Functionoverload(double x,double y)
        {
            return  x+y;
        }
    }

    public static void main(String[] args) {
          variable v= new variable();

        System.out.println( v.Functionoverload(12,13));
        System.out.println(   v.Functionoverload(12,13,14));
        System.out.println(v.Functionoverload(12.0,13.0));

    }
}
