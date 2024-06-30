package NitunSirLab;
class Animal{
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog is barking ");
    }
}
class Cat extends Dog{
    void color()
    {
        System.out.println("Cat is White");
    }
}
public class Problem_24 {
    public static void main(String[] args) {
        Cat sm=new Cat();
        sm.eat();
        sm.bark();
        sm.color();
    }
}
