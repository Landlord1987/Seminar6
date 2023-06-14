package org.example.OpenClosedPrinciple;

/**
 * Класс описывающий поведение Машины, наследующий поведение класса транспортных средств и реализующий интерфейс расчета скорости
 */
public class Car extends Vehicle implements SpeedCalculation{

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}
