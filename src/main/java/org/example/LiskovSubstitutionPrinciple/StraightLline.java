package org.example.LiskovSubstitutionPrinciple;

/**
 * Класс описывающий поведение прямой линии
 */
public class StraightLline {
    private int width;

    public StraightLline(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
