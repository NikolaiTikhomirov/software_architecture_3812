package Seminar3.HomeWork3.Task3;

// Переписать код в соответствии с Interface Segregation Principle:

public interface Shape {
    double area();
    double volume();
}

// Подсказка: круг не объемная фигура и этому классу не нужен метод volume().