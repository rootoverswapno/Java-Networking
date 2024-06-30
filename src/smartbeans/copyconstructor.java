package smartbeans;

import java.util.Scanner;

class copy{
    String name;
    int id;
    copy(String name,int id)
    {

        this.name=name;
        this.id=id;
    }
    copy(copy  obj)
    {
        this.name= obj.name;
        this.id= obj.id;
    }
}
 class copyconstructor {
    public static void main(String[] args) {
        System.out.println("First object");
        copy obj=new copy("swapno",120);
        System.out.println("NAME : "+obj.name+"  id: "+obj.id);
        copy obj1=new copy(obj);
        System.out.println("Copy object using copy constructor ");
        System.out.println("NAME : "+obj1.name+"  id: "+obj1.id);

    }
}
