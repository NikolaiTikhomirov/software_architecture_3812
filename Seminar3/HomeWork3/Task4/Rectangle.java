package Seminar3.HomeWork3.Task4;

// Переписать код в соответствии с Liskov Substitution Principle:

public class Rectangle extends Square{
    protected int height;

    @Override
    public void setWidth(int width) {
        super.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return super.width * this.height;
    }
}
