package org.example.OpenClosedPrinciple;

/**
 * Класс описывающий поведение транспортных средств
 */
public class Vehicle {
    int maxSpeed;
    String type;
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getType() {
        return this.type;
    }
}
