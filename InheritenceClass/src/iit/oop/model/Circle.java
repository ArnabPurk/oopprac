package iit.oop.model;

public class Circle extends Shape {
    private  int radius;
    public Circle() {

    }



    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

}
