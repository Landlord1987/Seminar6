package org.example.OpenClosedPrinciple;

/**
 * Класс описывающий поведение Автобуса, наследующий поведение класса транспортных средств и реализующий интерфейс расчета скорости
 */
public class Bus extends Vehicle implements SpeedCalculation{

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.6;
    }
}
