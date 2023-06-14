package org.example.InterfaceSegregationPrinciple;

/**
 * Класс Cube реализующий интерфейсы расчета площади и объема
 */
public class Cube implements Volume, Area {
    private int edge;
    public Cube(int edge) {
        this.edge = edge;
    }
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
