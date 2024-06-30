package oopjava;

import java.util.Scanner;

abstract class Shape{
    public Shape() {
        System.out.println("This is shape class constructor");
    }
   abstract public void area();

}
class circle extends Shape
{
    double raious;

    public circle(double raious) {
        this.raious = raious;
    }

    @Override
    public void area() {
        System.out.println(Math.PI*raious*raious);
    }
}



public class Area {
    public static void main(String[] args) {
       circle ch=new circle(5);
       ch.area();
    }
}
