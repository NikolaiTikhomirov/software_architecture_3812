package Seminar3.HomeWork3.Task5;

// Переписать код в соответствии с Dependency Inversion Principle:

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}


// Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.