package codewithswapno;
class Ekclas{
    int a;

    public int getA() {
        return a;
    }
    Ekclas(int a)
    {
        this.a=a;
    }
}
class Doclas extends Ekclas{
    Doclas(int c)
    {
        super(c);
        System.out.println("derived class constructor");
    }
}

public class superclass {
    public static void main(String[] args) {
     Ekclas e=new Ekclas(4);
     Doclas d=new Doclas(14);
        System.out.println(d.getA());
    }
}
