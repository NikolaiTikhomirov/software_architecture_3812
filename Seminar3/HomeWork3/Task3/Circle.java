package Seminar3.HomeWork3.Task3;

public class Circle implements Shape2DCalculate {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

}