package Seminar3.HomeWork3.Task4;

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width;
    }

    @Override
    public void setHeight(int height) {
        super.width = height;
        super.height = height;
    }
}