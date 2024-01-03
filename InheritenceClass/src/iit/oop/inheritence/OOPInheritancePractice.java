package iit.oop.inheritence;

import iit.oop.model.Circle;

public class OOPInheritancePractice {
    public static void main(String[] args) {
        Circle c1=new Circle("red",12);
        System.out.println(c1.calculateArea());
        System.out.println(c1.calculatePerimeter());
    }
}
