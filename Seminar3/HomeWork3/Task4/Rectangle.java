package Seminar3.HomeWork3.Task4;

// Переписать код в соответствии с Liskov Substitution Principle:

public class Rectangle extends Shape{
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }
}
