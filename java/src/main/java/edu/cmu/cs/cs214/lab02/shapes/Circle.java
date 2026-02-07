package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
