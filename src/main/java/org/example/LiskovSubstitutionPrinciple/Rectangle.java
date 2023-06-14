package org.example.LiskovSubstitutionPrinciple;

/**
 * Класс описывающий поведение прямоугольника, наследующий поведение квадрата
 */
public class Rectangle extends Square {
    private int height;

    public Rectangle(int width, int height) {
        super(width);
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int area() {
        return super.getWidth() * this.height;
    }
}
