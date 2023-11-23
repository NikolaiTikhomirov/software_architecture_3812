package Seminar3.HomeWork3.Task2;

// Переписать код SpeedCalculation в соответствии с Open-Closed Principle:

public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * vehicle.getAlloweSpeedRatio();
    }
}

// Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle),
// напишите метод calculateAllowedSpeed().
// Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP