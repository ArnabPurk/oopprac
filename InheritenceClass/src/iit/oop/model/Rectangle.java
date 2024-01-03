package iit.oop.model;

public class Rectangle extends Shape {
    private  int height;
    private int width;

    public Rectangle(String color,int height, int width) {
        this.height = height;
        this.width = width;
        this.color=color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(height+width);
    }
}
