package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public double area() {
        return width * height;
    }
}
