package Seminar3.HomeWork3.Task2;

public class Vehicle {
    int maxSpeed;
    String type;
    double allowedSpeedRatio;

    public Vehicle(int maxSpeed, String type, double allowedSpeedRatio) {
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.allowedSpeedRatio = allowedSpeedRatio;
    }
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }

    public double getAlloweSpeedRatio(){
        return allowedSpeedRatio;
    }
}