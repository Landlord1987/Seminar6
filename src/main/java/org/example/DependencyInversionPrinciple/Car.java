package org.example.DependencyInversionPrinciple;

/**
 * Класс Car реализует интерфейс StartEngine
 */
public class Car implements StartEngine {
    private PetrolEngine engine;
    public Car(PetrolEngine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}
