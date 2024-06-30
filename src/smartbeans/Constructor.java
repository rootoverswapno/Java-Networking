package smartbeans;

class Employe1 {

    String name;
    int id;
    Employe1(String name,int id)
    {
        this.name=name;
        this.id=id;

    }
}
 class Constructor {

    public static void main(String[] args) {
//        Constructor obj=new Constructor();
        Employe1 obj=new Employe1("SWapno",04);
        System.out.println("Name :"+obj.name+"    id: "+obj.id);
    }
}
